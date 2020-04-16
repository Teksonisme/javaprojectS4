package Grid_game;

public class TerrainVide extends Tile {
		TerrainVide(){
			super();	
		}
		public void prendFeu() {
			this.enFeu=true;
			this.setColor(Constantes.couleurFeu);
		}
}
