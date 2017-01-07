import java.io.*;
public class Consol { //made a mistake while typing class name... typed consol instead of console
	public static String readLine(){
		StringBuffer response = new StringBuffer();
		try{
			BufferedInputStream bin = new BufferedInputStream(System.in);
			int in = 0;
			char inChar = 0;
			do {
				in= bin.read();
				inChar = (char) in;
				if(in != -1){
					response.append(inChar);
				}
				
			}while((in != -1 ) & (inChar != '\n'));
			bin.close();
			return response.toString();
		}catch (IOException e){
			System.out.println("Exception - "  + e.getMessage());
			return null;
		}
	}
	public static void main(String[] args){
		System.out.println("You are standing at the end of the road ");
		System.out.println("before a small brick building. Around you ");
		System.out.println("is a forest. A small stream flows out of ");
		System.out.println("the building and down a gully.\n ");
		System.out.println("> ");
		String input = Consol.readLine();
		System.out.println("That’s not a verb I recognize.");
	} 
}
