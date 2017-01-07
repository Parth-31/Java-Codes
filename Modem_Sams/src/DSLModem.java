
public class DSLModem extends Modem {

String method = "DSL phone connection";
	
	public void connect(){
		
		System.out.println("Connecting to internet");
		System.out.println("Using a " + method);
		
	}

}
