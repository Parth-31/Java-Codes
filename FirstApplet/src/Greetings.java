import java.awt.*;
public class Greetings extends javax.swing.JApplet{
	String greet;
	public void init(){
		greet = "Hello Kitty!";
	}
	public void paint(Graphics screen){
		Graphics2D screen2D = (Graphics2D) screen;
		screen2D.drawString(greet,25,50);
	}

}



