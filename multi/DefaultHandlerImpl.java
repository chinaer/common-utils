package multi;

public class DefaultHandlerImpl implements MultiHandler{

	@Override
	public void handle(Packet packet) {
		System.out.println(new String(packet.getData()));
		System.out.println("received the packet");
	}

}
