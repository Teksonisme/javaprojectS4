package Grid_game;
import java.awt.Color;

public abstract class Arbre extends Tile{
	int resistance;
	boolean enFeu;
	int health;
	
	Arbre(Color c,int resistance){
		super(c);
		this.resistance = resistance;
		this.enFeu=false;
	}
	public void prendFeu() {
		this.enFeu=true;
		this.setColor(Constantes.couleurFeu);
	}
	public boolean getEtatFeu() {
		return this.enFeu;
	}
	public abstract TypeArbre getType();
	public int getResistance() {
		return this.resistance;
	}
	public void setHealth(int h) {
		this.health-=h;
	}
	
}
