import java.awt.Graphics;
import java.awt.Color;
public class Feu extends Entite{
	int life,x,y;
	Color c;
	GameLoop game;
	
	Feu(int x,int y, GameLoop g){
		super(x,y,new Color(139,0,0),g);
	}
	void paint(Graphics g){
		g.setColor(this.c);
		g.fillRect(x,y,40,40);
	}
}
