package Grid_game;

import java.awt.Graphics;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.util.Random;

public abstract class Tile extends Button{
	static Color c;
	Main_of_game game;
	boolean enFeu;
	
	Tile(){
		this.c=Color.white;
		this.setBackground(this.c);
	}
	Tile(Color c){
		this.c = c;
		this.setBackground(c);
	}
	public void setColor(Color c) {
		this.c = c;
		this.setBackground(c);
	}
	public abstract void prendFeu();
}