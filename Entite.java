import java.awt.Color;
import java.awt.Graphics;

public class Entite extends Displayable {	
	int x,y;
	GameLoop game;
	
	Entite(int x, int y, Color c, GameLoop game){
		super(x,y,c);
		this.game = game;
	}

	void paint(Graphics g){
		super.paint(g);
		g.setColor(this.c);
	}
	
}
