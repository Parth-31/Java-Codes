import javax.swing.*;

public class MainFrame extends JFrame{
	
	public MainFrame(){
		super("Main Frame!");
		setLookAndFeel(); // method is created below
		setSize(350,100);
		//pack();  //auto define the size of frame 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); //frame visibility has to be true
	}
	
	private void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch(Exception exc){
			
		}
	}
	public static void main(String[] args){
		MainFrame main = new MainFrame();
	}
	

}
