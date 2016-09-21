package multi.test;

import multi.Packet;
import multi.UDPBroadCast;


public class Server {
	
	 public static void main(String[] args) {
		UDPBroadCast server=new UDPBroadCast();
		try {
			Packet packet=new Packet();
			packet.setData("lisi".getBytes());
			server.broadCast(packet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
