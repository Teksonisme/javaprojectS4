package Grid_game;

import java.awt.Color;

public abstract class Arbre extends Tile{
	int resistance,healthResistance,health;
	int healthFeu;

	Arbre(Color c, int resistance,int x,int y) {
		super(c,x,y);
		this.resistance = resistance;
		this.etat = "base";
		this.healthResistance = 10 * this.resistance;
		this.health = 10;
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
	//HealthRes
	public void setHealthRes(int h) {
		this.healthResistance -= h;
	}
	public int getHealthRes() {
		return this.healthResistance;
	}
	//HealthFeu
	public void setHealthFeu(int h) {
		this.healthFeu -= h;
	}
	public int getHealthFeu() {
		return this.healthFeu;
	}
	//Health
	public void setHealth(int h) {
		this.health -= h;
	}
	public int getHealth() {
		return this.health;
	}
	
	public void mort() {
		this.etat = "mort";
		this.setColor(new Color(192, 192, 192));
	}

}
