
public class CableModem extends Modem{
	String method = "cable connection";
	
	public void connect(){
		
		System.out.println("Connecting to internet");
		System.out.println("Using a " + method);
		
	}

}
