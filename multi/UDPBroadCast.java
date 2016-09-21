package multi;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class UDPBroadCast {
	
	 private String host = "228.5.6.7";
     private int port = 9998;   
     private static final int TTLTime = 4;
     private MulticastSocket socket=null;
     
     public UDPBroadCast(){};
     
     public UDPBroadCast(String host,int port){
    	 this.host=host;
    	 this.port=port;
     }
     
     public void broadCast(Packet data) throws Exception {
    	 InetAddress destAddress = InetAddress.getByName(host);  
         if(!destAddress.isMulticastAddress()){
        	 	   //检测该地址是否是多播地址  
                  throw new Exception("地址不是多播地址");
         }
         int destPort = port;
         int TTL = TTLTime;
         socket =new MulticastSocket();  
         socket.setTimeToLive(TTL);
         byte[] sendMSG=Packet.toByteArray(data);
         DatagramPacket dp = new DatagramPacket(sendMSG, sendMSG.length, destAddress, destPort);
         socket.send(dp);
     }
     

}
