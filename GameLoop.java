import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;

public class GameLoop {
	Entite[] entite = new Entite[0];
	GameFrame frame;
	int w,h;
	
	public GameLoop(int w, int h,int nbrEntite){
		this.w = w;
		this.h = h;
		nbrEntite = 5;
		this.entite = new Entite[nbrEntite];
		this.entite[1] = new Arbre(50,50,this);
		this.frame = new GameFrame(w,h,this);
	}
	Displayable[] getDisplayables(){
		return this.entite;
	}
	
	public void run(){
		while(true){
			try{Thread.sleep(10);}catch(InterruptedException e){}
			//this.frame.repaint();
		}
	}
	public static void main(String[] args){
		GameLoop gl = new GameLoop(1000,800,1000);
		gl.run();
	}	
}
