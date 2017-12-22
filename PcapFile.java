
package my_wireshark;

import java.util.Date; 
import org.jnetpcap.*;
import org.jnetpcap.packet.*;
import org.jnetpcap.util.PcapPacketArrayList;

public class PcapFile {
    String FileAddress = "";
    
    public PcapFile(String FileAddress){
        this.FileAddress = FileAddress;
    }
    
    public PcapPacketArrayList readOfflineFiles()  {
        final StringBuilder errbuf = new StringBuilder();
        Pcap pcap = Pcap.openOffline(FileAddress, errbuf);
      
        PcapPacketHandler<PcapPacketArrayList> jpacketHandler = new PcapPacketHandler<PcapPacketArrayList>() {
            public void nextPacket(PcapPacket packet, PcapPacketArrayList PaketsList) {
                PaketsList.add(packet);
            }
        };
        try {
            PcapPacketArrayList packets = new PcapPacketArrayList();
            pcap.loop(-1, jpacketHandler, packets);

            return packets;
        } finally {
            //Last thing to do is close the pcap handle
            pcap.close();
        }
    }
    
}
