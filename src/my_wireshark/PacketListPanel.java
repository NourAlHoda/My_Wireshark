package my_wireshark;

import java.awt.Dimension;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import org.jnetpcap.protocol.network.Ip4;
import org.jnetpcap.util.PcapPacketArrayList;

public class PacketListPanel extends javax.swing.JPanel{


    ArrayList<ArrayList<JTextField>> packets;
    PcapPacketArrayList loaded;
    JFileChooser fc;
    public static String filename;
    public PacketListPanel() {
        initComponents();
        packets = new ArrayList<>();
        fc = new JFileChooser();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 874, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel1);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Number");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Date");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Source");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Destination");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Protocol");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Length");

        jButton1.setText("Show Packets");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detailed View"));
        jScrollPane1.setViewportView(jTextArea1);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("View packet number:");

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createTitledBorder("Hex View"));
        jScrollPane3.setViewportView(jTextArea2);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("Filter:");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Protocol", "Source", "Destination", "Date", "Length", "Number" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 0, 102));
        jButton2.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Save");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 0, 102));
        jButton3.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Load");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel3)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4)
                        .addGap(334, 334, 334))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(8, 8, 8))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(590, 590, 590)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int size = MyInterface.packetList[0].size();
            for (int i = 0; i < size ; i++){
                String text = this.jTextField1.getText();
                if (!(text.equals(""))){
                    if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Protocol")){
                        if (!(MyInterface.packetList[4].get(i).equals(text)))
                            continue;
                    }
                    else if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Date")){
                        if (!(MyInterface.packetList[1].get(i).equals(text)))
                            continue;

                    }
                    else if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Length")){
                        if (!(MyInterface.packetList[5].get(i).equals(text)))
                            continue;

                    }
                    else if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Source")){
                        if (!(MyInterface.packetList[2].get(i).equals(text)))
                            continue;

                    }
                    else if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Destination")){
                        if (!(MyInterface.packetList[3].get(i).equals(text)))
                            continue;

                    }  
                }
                packets.add(new ArrayList<JTextField>(6));
                if (packets.size() > 5)
                    this.jPanel1.setPreferredSize(new Dimension(this.jPanel1.getSize().width, this.jPanel1.getSize().height + 30));
                packets.get(packets.size()-1).add(new JTextField());
                packets.get(packets.size()-1).get(0).setBounds(0, 30*i , 140, 30);
                packets.get(packets.size()-1).get(0).setText(i+"");
                this.jPanel1.add(packets.get(packets.size()-1).get(0));
                for (int j = 1 ; j < 6 ; j++){
                    packets.get(packets.size()-1).add(new JTextField());
                    packets.get(packets.size()-1).get(j).setBounds(140*j, 30*i , 140, 30);
                    packets.get(packets.size()-1).get(j).setText(MyInterface.packetList[j].get(i));
                    this.jPanel1.add(packets.get(packets.size()-1).get(j));this.jPanel1.validate();

                }
                this.jPanel1.setSize(this.jPanel1.getSize().width , this.jPanel1.getSize().height+30);
            }
            
        
        for (int k = 0 ; k < MyInterface.packetList[1].size()  ; k++){
            this.jComboBox1.addItem(k+"");
        }
        
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        if (MyInterface.pcapPackets.isEmpty()){
            jTextArea1.setText(loaded.get(jComboBox1.getSelectedIndex()).toString());
            jTextArea2.setText(loaded.get(jComboBox1.getSelectedIndex()).toHexdump());
        }
        else{
            jTextArea1.setText(MyInterface.pcapPackets.get(jComboBox1.getSelectedIndex()).toString());
            jTextArea2.setText(MyInterface.pcapPackets.get(jComboBox1.getSelectedIndex()).toHexdump());
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
      
                
        
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
//        this.jPanel1.removeAll();
//        this.jPanel1.revalidate();
//        this.jPanel1.repaint();
//        this.jTextArea1.setText("");
//        this.jTextArea2.setText("");
//        this.packets.clear();
//        
//        int size = MyInterface.packetList[0].size();
//        
//            for (int i = 0; i < size ; i++){
//                String text = this.jTextField1.getText();
//                if (!(text.equals(""))){
//                    if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Protocol")){
//                        if (!(MyInterface.packetList[4].get(i).equals(text)))
//                            continue;
//                    }
//                    else if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Date")){
//                        if (!(MyInterface.packetList[1].get(i).equals(text)))
//                            continue;
//
//                    }
//                    else if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Length")){
//                        if (!(MyInterface.packetList[5].get(i).equals(Integer.parseInt(text))))
//                            continue;
//
//                    }
//                    else if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Source")){
//                        if (!(MyInterface.packetList[2].get(i).equals(text)))
//                            continue;
//
//                    }
//                    else if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Destination")){
//                        if (!(MyInterface.packetList[3].get(i).equals(text)))
//                            continue;
//
//                    }  
//                }
//                packets.add(new ArrayList<JTextField>(6));
//                if (packets.size() > 5)
//                    this.jPanel1.setPreferredSize(new Dimension(this.jPanel1.getSize().width, this.jPanel1.getSize().height + 30));
//                packets.get(packets.size()-1).add(new JTextField());
//                packets.get(packets.size()-1).get(0).setBounds(0, 30*i , 140, 30);
//                packets.get(packets.size()-1).get(0).setText(i+"");
//                this.jPanel1.add(packets.get(packets.size()-1).get(0));
//                for (int j = 1 ; j < 6 ; j++){
//                    packets.get(packets.size()-1).add(new JTextField());
//                    packets.get(packets.size()-1).get(j).setBounds(140*j, 30*i , 140, 30);
//                    packets.get(packets.size()-1).get(j).setText(MyInterface.packetList[j].get(i));
//                    this.jPanel1.add(packets.get(packets.size()-1).get(j));this.jPanel1.validate();
//
//                }
//                this.jPanel1.setSize(this.jPanel1.getSize().width , this.jPanel1.getSize().height+30);
//            }
//            
//        
//        for (int k = 0 ; k < MyInterface.packetList[1].size()  ; k++){
//            this.jComboBox1.addItem(k+"");
//        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        this.jPanel1.removeAll();
        this.jPanel1.revalidate();
        this.jPanel1.repaint();
        this.jTextArea1.setText("");
        this.jTextArea2.setText("");
        this.packets.clear();
        
        
   
        if (true){
                 int size = MyInterface.packetList[0].size();
            for (int i = 0; i < size ; i++){
                String text = this.jTextField1.getText();
                if (!(text.equals(""))){
                    if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Protocol")){
                        if (!(MyInterface.packetList[4].get(i).equals(text)))
                            continue;
                    }
                    else if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Date")){
                        if (!(MyInterface.packetList[1].get(i).equals(text)))
                            continue;

                    }
                    else if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Length")){
                        if (!(MyInterface.packetList[5].get(i).equals(Integer.parseInt(text))))
                            continue;

                    }
                    else if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Source")){
                        if (!(MyInterface.packetList[2].get(i).equals(text)))
                            continue;

                    }
                    else if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Destination")){
                        if (!(MyInterface.packetList[3].get(i).equals(text)))
                            continue;

                    }  
                }
                packets.add(new ArrayList<JTextField>(6));
                if (packets.size() > 5)
                    this.jPanel1.setPreferredSize(new Dimension(this.jPanel1.getSize().width, this.jPanel1.getSize().height + 30));
                packets.get(packets.size()-1).add(new JTextField());
                packets.get(packets.size()-1).get(0).setBounds(0, 30*i , 140, 30);
                packets.get(packets.size()-1).get(0).setText(i+"");
                this.jPanel1.add(packets.get(packets.size()-1).get(0));
                for (int j = 1 ; j < 6 ; j++){
                    packets.get(packets.size()-1).add(new JTextField());
                    packets.get(packets.size()-1).get(j).setBounds(140*j, 30*i , 140, 30);
                    packets.get(packets.size()-1).get(j).setText(MyInterface.packetList[j].get(i));
                    this.jPanel1.add(packets.get(packets.size()-1).get(j));this.jPanel1.validate();

                }
                this.jPanel1.setSize(this.jPanel1.getSize().width , this.jPanel1.getSize().height+30);
            }
            
        
        for (int k = 0 ; k < MyInterface.packetList[1].size()  ; k++){
            this.jComboBox1.addItem(k+"");
        }
        }
        else{
            for (int i = 0; i < loaded.size() ; i++){
                String text = this.jTextField1.getText();
                Ip4 ip = new Ip4();
                if (!(text.equals(""))){
                    if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Protocol")){
                        if (!(ip.typeEnum().name().equals(text)))
                            continue;
                 
                    }
                    else if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Date")){
                        if (!(MyInterface.packetList[1].get(i).equals(text)))
                            continue;

                    }
                    else if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Length")){
                        if (!(MyInterface.packetList[5].get(i).equals(text)))
                            continue;

                    }
                    else if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Source")){
                        if (!(MyInterface.packetList[2].get(i).equals(text)))
                            continue;

                    }
                    else if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Destination")){
                        if (!(MyInterface.packetList[3].get(i).equals(text)))
                            continue;

                    }  
                }
                packets.add(new ArrayList<JTextField>(6));
                if (packets.size() > 5)
                    this.jPanel1.setPreferredSize(new Dimension(this.jPanel1.getSize().width, this.jPanel1.getSize().height + 30));
                packets.get(packets.size()-1).add(new JTextField());
                packets.get(packets.size()-1).get(0).setBounds(0, 30*i , 140, 30);
                packets.get(packets.size()-1).get(0).setText(i+"");
                
                this.jPanel1.add(packets.get(packets.size()-1).get(0));
                for (int j = 1 ; j < 6 ; j++){
                    packets.get(packets.size()-1).add(new JTextField());
                    packets.get(packets.size()-1).get(j).setBounds(140*j, 30*i , 140, 30);
                    if (j == 1){
                        String d = new Date(loaded.get(i).getCaptureHeader().timestampInMillis()).toString();
                        packets.get(packets.size()-1).get(j).setText((d));
                    } 
                    else if (j == 2 && loaded.get(i).hasHeader(ip))
                        packets.get(packets.size()-1).get(j).setText(org.jnetpcap.packet.format.FormatUtils.ip(loaded.get(i).getHeader(ip).source()));
                    
                    else if (j == 3 && loaded.get(i).hasHeader(ip))
                        packets.get(packets.size()-1).get(j).setText(org.jnetpcap.packet.format.FormatUtils.ip(loaded.get(i).getHeader(ip).destination()));
                    else if (j == 4)
                        packets.get(packets.size()-1).get(j).setText(ip.typeEnum().name());
                    else if (j == 5)
                        packets.get(packets.size()-1).get(j).setText(loaded.get(i).getCaptureHeader().caplen()+"");
                    
                    this.jPanel1.add(packets.get(packets.size()-1).get(j));this.jPanel1.validate();

                }
                this.jPanel1.setSize(this.jPanel1.getSize().width , this.jPanel1.getSize().height+30);


            }
            
           
        }
                            
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
         int rVal = fc.showSaveDialog(this);
        if (rVal == JFileChooser.APPROVE_OPTION) {
            filename = fc.getSelectedFile().getName();
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        if (packets.size() > 0){
            this.jPanel1.removeAll();
            this.jPanel1.revalidate();
            this.jPanel1.repaint();
            this.jTextArea1.setText("");
            this.jTextArea2.setText("");
            this.packets.clear();
        }
  
        File file = null;
        
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
        }
        
        PcapFile pf = new PcapFile(file.getName());
        loaded = pf.readOfflineFiles();
        
            for (int i = 0; i < loaded.size() ; i++){
                String text = this.jTextField1.getText();
                if (!(text.equals(""))){
                    if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Protocol")){
                        if (!(MyInterface.packetList[4].get(i).equals(text)))
                            continue;
                 
                    }
                    else if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Date")){
                        if (!(MyInterface.packetList[1].get(i).equals(text)))
                            continue;

                    }
                    else if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Length")){
                        if (!(MyInterface.packetList[5].get(i).equals(text)))
                            continue;

                    }
                    else if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Source")){
                        if (!(MyInterface.packetList[2].get(i).equals(text)))
                            continue;

                    }
                    else if (this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex()).equals("Destination")){
                        if (!(MyInterface.packetList[3].get(i).equals(text)))
                            continue;

                    }  
                }
                packets.add(new ArrayList<JTextField>(6));
                if (packets.size() > 5)
                    this.jPanel1.setPreferredSize(new Dimension(this.jPanel1.getSize().width, this.jPanel1.getSize().height + 30));
                packets.get(packets.size()-1).add(new JTextField());
                packets.get(packets.size()-1).get(0).setBounds(0, 30*i , 140, 30);
                packets.get(packets.size()-1).get(0).setText(i+"");
                Ip4 ip = new Ip4();
                this.jPanel1.add(packets.get(packets.size()-1).get(0));
                for (int j = 1 ; j < 6 ; j++){
                    packets.get(packets.size()-1).add(new JTextField());
                    packets.get(packets.size()-1).get(j).setBounds(140*j, 30*i , 140, 30);
                    if (j == 1){
                        String d = new Date(loaded.get(i).getCaptureHeader().timestampInMillis()).toString();
                        packets.get(packets.size()-1).get(j).setText((d));
                    } 
                    else if (j == 2 && loaded.get(i).hasHeader(ip))
                        packets.get(packets.size()-1).get(j).setText(org.jnetpcap.packet.format.FormatUtils.ip(loaded.get(i).getHeader(ip).source()));
                    
                    else if (j == 3 && loaded.get(i).hasHeader(ip))
                        packets.get(packets.size()-1).get(j).setText(org.jnetpcap.packet.format.FormatUtils.ip(loaded.get(i).getHeader(ip).destination()));
                    else if (j == 4)
                        packets.get(packets.size()-1).get(j).setText(ip.typeEnum().name());
                    else if (j == 5)
                        packets.get(packets.size()-1).get(j).setText(loaded.get(i).getCaptureHeader().caplen()+"");
                    
                    this.jPanel1.add(packets.get(packets.size()-1).get(j));this.jPanel1.validate();

                }
                this.jPanel1.setSize(this.jPanel1.getSize().width , this.jPanel1.getSize().height+30);


            }
            
            this.jComboBox1.removeAllItems();
            for (int k = 0 ; k < loaded.size()  ; k++){
                this.jComboBox1.addItem(k+"");
            }
    }//GEN-LAST:event_jButton3MouseClicked




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
