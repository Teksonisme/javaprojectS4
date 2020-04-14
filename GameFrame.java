import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;

public class GameFrame extends JFrame{
	
	private GameLoop game;
	/*static GraphicsConfiguration gc;*/
	
	public GameFrame(int h,int w, GameLoop gl) {
		super("Feu de forêt");
		this.game = gl;
		this.setBackground(Color.WHITE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(w,h);
		this.setResizable(false);
		this.setVisible(true);
	}
	public void paint(Graphics gr){
		gr.setColor(Color.WHITE);
		//gr.fillRect(0,0,this.getWidth(),this.getHeight());
		Displayable[] t = this.game.getDisplayables();
		for(int i=0;i<t.length;i++) t[i].paint(gr);
	}
}
