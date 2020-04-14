import java.awt.Color;
import java.awt.Graphics;

public class Arbre extends Entite{
	int life,x,y;
	Color c;
	GameLoop game;
	
	Arbre(int x,int y, GameLoop g){
		super(x,y,new Color(50,205,50),g);
	}
	void paint(Graphics g){
		g.setColor(this.c);
		g.fillRect(x, y, 40, 40);
	}
}
