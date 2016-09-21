package multi.test;

import multi.UDPListener;


public abstract class Client {

	public static void main(String[] args) {
	  	final UDPListener listener=new UDPListener();
		try {
			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						listener.listen();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}).start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
