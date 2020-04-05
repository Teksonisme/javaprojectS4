import javax.swing.JFrame;
import java.awt.GraphicsConfiguration;

public class GameFrame extends JFrame{
	
	private GameLoop game;
	static GraphicsConfiguration gc;
	
	public static void main(String[] args){
		JFrame frame= new JFrame(gc);
		frame.setTitle("Feu de forêt");
		frame.setSize(1152,720);
		frame.setResizable(false);
		frame.setLocation(350,200);
		frame.setVisible(true);
	}
}
