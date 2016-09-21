package multi;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Packet implements Serializable{
	
	private static final long serialVersionUID = 4690811016163587751L;
	
	public static final int MaxLength=1024;
	
	private byte[] data;
	
	private int length;
	
	public static byte[] toByteArray (Object obj) {  
	        byte[] bytes = null;     
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();     
	        try {       
	            ObjectOutputStream oos = new ObjectOutputStream(bos);        
	            oos.writeObject(obj);       
	            oos.flush();        
	            bytes = bos.toByteArray ();     
	            oos.close();        
	            bos.close();       
	        } catch (IOException ex) {       
	            ex.printStackTrace();  
	        }     
	        return bytes;   
	    }  
	      
	    /** 
	     * 数组转对象 
	     * @param bytes 
	     * @return 
	     */  
	    public static Object toObject (byte[] bytes) {     
	        Object obj = null;     
	        try {       
	            ByteArrayInputStream bis = new ByteArrayInputStream (bytes);       
	            ObjectInputStream ois = new ObjectInputStream (bis);       
	            obj = ois.readObject();     
	            ois.close();  
	            bis.close();  
	        } catch (IOException ex) {       
	            ex.printStackTrace();  
	        } catch (ClassNotFoundException ex) {       
	            ex.printStackTrace();  
	        }     
	        return obj;   
	    }

		public byte[] getData() {
			length=data.length;
			return data;
		}

		public void setData(byte[] data) {
			this.data = data;
		}

		public int getLength() {
			return length;
		}

		public void setLength(int length) {
			this.length = length;
		} 
	    
}
