import java.awt.Graphics;
import java.awt.Color;

class Displayable{
  int x,y,radius = 4; // (x,y):position, radius:pour l'affichage
	Color c;
  Displayable(int x, int y, Color c){
    this.x = x; this.y = y;
    this.c = c;
  }
  void paint(Graphics g){
		g.setColor(this.c);
	}
}
