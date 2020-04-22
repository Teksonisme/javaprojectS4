package Grid_game;

import java.awt.Color;

public abstract class Arbre extends Tile{
	int resistance,healthResistance,healthArbre;
	int healthFeu;

	Arbre(Color c, int resistance,int x,int y) {
		super(c,x,y);
		this.resistance = resistance;
		this.etat = "base";
		this.healthResistance = 10 * this.resistance;
		this.healthFeu = 0;
	}

	public void prendFeu() {
		this.etat = "feu";
		this.setColor(Constantes.couleurFeu);
		this.healthFeu = 10;
	}

	public String getEtat() {
		return this.etat;
	}

	public abstract TypeArbre getType();

	public int getResistance() {
		return this.resistance;
	}

	public void setHealthRes(int h) {
		this.healthResistance -= h;
	}

	public int getHealthRes() {
		return this.healthResistance;
	}

	public int getHealthFeu() {
		return this.healthFeu;
	}

	public void mort() {
		this.setColor(new Color(192, 192, 192));
	}

}
