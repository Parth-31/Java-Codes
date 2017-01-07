
public class ModemTester {
	public static void main(String[] args){
		CableModem surfBoard = new CableModem();
		DSLModem gateway = new DSLModem();
		surfBoard.speed = 500000;
		gateway.speed = 400000;
		System.out.println("Trying cable modem");
		surfBoard.displaySpeed();
		surfBoard.connect();
		System.out.println("Trying DSL modem");
		gateway.displaySpeed();
		gateway.connect();
	}
}
