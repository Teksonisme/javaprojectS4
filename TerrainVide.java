package Grid_game;

public class TerrainVide extends Tile {
	String etat;
	int healthFeu;

	TerrainVide(int x,int y) {
		super(x,y);
		this.etat = "base";
		this.healthFeu = 0;
	}

	public void prendFeu() {
	}

	public String getEtat() {
		return this.etat;
	}

	public void setHealthRes(int h) {
		this.healthFeu -= h;
	}

	public int getHealthRes() {
		return 0;
	}

	public int getHealthFeu() {
		return this.healthFeu;
	}

	public TypeArbre getType() {
		return TypeArbre.UNDEFINED;
	}
}
