/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_wireshark;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import org.jnetpcap.*;
import org.jnetpcap.nio.JBuffer;
import org.jnetpcap.packet.PcapPacket;
import org.jnetpcap.packet.PcapPacketHandler;
import org.jnetpcap.protocol.network.Ip4;

/**
 *
 * @author HP
 */
public class MyInterface extends javax.swing.JPanel {

    StringBuilder errbuf;
    ArrayList<PcapIf> alldevs;
    public static PacketHandler handler;
    Pcap pcap;
    private PacketListPanel plp;
    public static boolean stop;
    public static ArrayList<String>[] packetList = (ArrayList<String>[])new ArrayList[6];
    public static ArrayList<PcapPacket> pcapPackets = new ArrayList<>();

    public MyInterface() {
        initComponents();
        plp = new PacketListPanel();
        plp.setBounds(0, 70, 900, 800);
        this.add(plp);
        load_interfaces();
        stop = true;
    }

    private void load_interfaces() {
       
        alldevs = new ArrayList<PcapIf>(); // Will be filled with NICs  
        errbuf = new StringBuilder();     // For any error msgs  

        int r = Pcap.findAllDevs(alldevs, errbuf);
        if (r == Pcap.NOT_OK || alldevs.isEmpty()) {
            System.err.printf("Can't read list of devices, error is %s", errbuf.toString());
            return;
        }
        for (int i = 0; i < alldevs.size(); i++) {
            if (alldevs.get(i).getDescription().equals("Microsoft")) {
                som3a.addItem("Wi-Fi");
            } else {
                som3a.addItem(alldevs.get(i).getDescription());
            }
        }
    }

    private void capture_packets(int index) {
        int snaplen = 64 * 1024;           // Capture all packets, no trucation  
        int flags = Pcap.MODE_PROMISCUOUS; // capture all packets  
        int timeout = 10 * 1000;           // 10 seconds in millis  
        pcap
                = Pcap.openLive(alldevs.get(index).getName(), snaplen, flags, timeout, errbuf);

        if (pcap == null) {
            System.err.printf("Error while opening device for capture: "
                    + errbuf.toString());
            return;
        }

        handler = new PacketHandler(pcap);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        som3a = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        som3a.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 21)); // NOI18N
        som3a.setForeground(new java.awt.Color(102, 102, 102));
        som3a.setAutoscrolls(true);

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Start Capturing");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 0, 102));
        jButton2.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Stop Capturing");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Select Capture Network:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(som3a, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(som3a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(717, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        capture_packets(som3a.getSelectedIndex());
        stop = false;
        handler.start();
//        Thread t = new Thread(plp);
//        t.start();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        stop = true;
    }//GEN-LAST:event_jButton2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> som3a;
    // End of variables declaration//GEN-END:variables
}

class PacketHandler extends Thread {

    Pcap pcap;
    PcapPacketHandler<String> jpacketHandler;
    JBufferHandler<PcapDumper> dumpHandler;
    int index;
    String date,source,dest,protocol,length;
    PcapDumper dumper;
    Pcap pcapoff;
    String ofile;
   

    public PacketHandler(Pcap pcap) {
        super();
        StringBuilder errbuf = new StringBuilder();  
        //String fname = "tests/test-afs.pcap";  
        pcapoff = Pcap.openOffline(PacketListPanel.filename, errbuf);
        ofile = PacketListPanel.filename;  
        dumper = pcap.dumpOpen(ofile);
        this.pcap = pcap;
        MyInterface.packetList[0] = new ArrayList<>();
        MyInterface.packetList[1] = new ArrayList<>();
        MyInterface.packetList[2] = new ArrayList<>();
        MyInterface.packetList[3] = new ArrayList<>();
        MyInterface.packetList[4] = new ArrayList<>();
        MyInterface.packetList[5] = new ArrayList<>();
        index=0;
        
        jpacketHandler = new PcapPacketHandler<String>() {

            public void nextPacket(PcapPacket packet, String user) {
                
                date = new Date(packet.getCaptureHeader().timestampInMillis()).toString();
                length = packet.getCaptureHeader().caplen()+""; // Length actually captured  
                
                Ip4 ip = new Ip4();
                byte[] dIP = new byte[4], sIP = new byte[4]; 
                if (packet.hasHeader(ip)) {
                    dIP = packet.getHeader(ip).destination();
                    sIP = packet.getHeader(ip).source();}
              

                source = org.jnetpcap.packet.format.FormatUtils.ip(sIP);
                dest = org.jnetpcap.packet.format.FormatUtils.ip(dIP);                    
                protocol = ip.typeEnum().name();
                                
                if(date.equals("")||length.equals("")||source.equals("")||dest.equals("")||protocol.equals(""))
                    return;
                else{
                    MyInterface.pcapPackets.add(packet);
                    MyInterface.packetList[0].add(index++ +"");
                    MyInterface.packetList[1].add(date);
                    MyInterface.packetList[2].add(source);
                    MyInterface.packetList[3].add(dest);
                    MyInterface.packetList[4].add(protocol);
                    MyInterface.packetList[5].add(length);
                    
                    for(int i=0; i<MyInterface.packetList[0].size(); i++){
                        System.out.println(MyInterface.packetList[0].get(i));
                        System.out.println(MyInterface.packetList[1].get(i));
                        System.out.println(MyInterface.packetList[2].get(i));
                        System.out.println(MyInterface.packetList[3].get(i));
                        System.out.println(MyInterface.packetList[4].get(i));
                        System.out.println(MyInterface.packetList[5].get(i));
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println(packet.toString());
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println(packet.toHexdump());
                        
                }
                }
            }
        };
        
        dumpHandler = new JBufferHandler<PcapDumper>() {  
  
        public void nextPacket(PcapHeader header, JBuffer buffer, PcapDumper dumper) {    
            dumper.dump(header, buffer);
        }};  
  
    }

    @Override
    public void run() {
        while (!MyInterface.stop) {
            pcap.loop(10, jpacketHandler, "");
            pcap.loop(10, dumpHandler, dumper);
        }
        File file = new File(ofile); 
        dumper.close();
        pcap.close();
    }
}
