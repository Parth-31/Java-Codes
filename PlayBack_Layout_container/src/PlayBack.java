import java.awt.*;
import javax.swing.*;

public class PlayBack extends JFrame {
	public PlayBack(){
		
		super("Playback");
		setLookAndFeel();
		setSize(1000,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		JButton play = new JButton("Play");
		JButton stop = new JButton("Stop");
		JButton pause = new JButton("Pause");
		JLabel pageLabel = new JLabel("Web page address: ", JLabel.RIGHT);
		JTextField pageAddress = new JTextField("Enter web adress here",20); //default statement in textbox
		add(play);
		add(stop);
		add(pause);
		add(pageLabel);
		add(pageAddress);
		
		setVisible(true);
	}
	
	public void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch(Exception exc){
			
		}
	}
	
	public static void main(String[] args){
		PlayBack pb = new PlayBack();
	}
	
}

