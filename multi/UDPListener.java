package multi;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class UDPListener {

	final static int RECEIVE_LENGTH = Packet.MaxLength;
	private String host = "228.5.6.7";
	private MultiHandler handler=new DefaultHandlerImpl();
	private int port = 9998;
	private MulticastSocket socket=null;
	
	public UDPListener(){}
	
	public UDPListener(String host,int port,MultiHandler handler) {
		this.handler=handler;
		this.host=host;
		this.port=port;
	}

	public void listen() throws Exception{
		InetAddress receiveAddress = InetAddress.getByName(host);
		if (!receiveAddress.isMulticastAddress()) {// 测试是否为多播地址
			throw new Exception("请使用多播地址");
		}
		socket = new MulticastSocket(port);
		socket.joinGroup(receiveAddress);
		DatagramPacket dp = new DatagramPacket(new byte[RECEIVE_LENGTH],
				RECEIVE_LENGTH);
		while (true) {
			try{
				socket.receive(dp);
				handler.handle((Packet) Packet.toObject(dp.getData()));
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
