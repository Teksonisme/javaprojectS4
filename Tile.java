package Grid_game;

import javax.swing.JButton;
import java.awt.Color;

public abstract class Tile extends JButton {
	Color c;
	Main_of_game game;
	String etat;
	int x,y;
	//Constructeur tile type : TerrainVide
	Tile(int x,int y) {
		this.c = new Color(255,255,255); this.setBackground(this.c);
		this.x=x; this.y=y;
	}
	//Constructeur tile type : Arbre,Pompier
	Tile(Color c,int x,int y) {
		this.c = c; this.setBackground(c);
		this.x=x; this.y=y;
	}
	//Set color of object & new background color
	public void setColor(Color c) {
		this.c = c; this.setBackground(c);
	}
	
	//abstract methods
	public abstract void prendFeu();
	public abstract String getEtat();
	public abstract int getHealthRes();
	public abstract void setHealthRes(int h);
	public abstract int getHealthFeu();
	public abstract void setHealthFeu(int h);
	public abstract int getHealth();
	public abstract void setHealth(int h);
	public abstract TypeArbre getType();
	public abstract void mort();
}