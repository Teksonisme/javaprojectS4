package Grid_game;

import Grid_game.Constantes;
import java.awt.*;
import javax.swing.JFrame;

public class TileGrid {
	
	public static Tile[][] map;
	
	public static Tile[][] generateMap() {
		map = new Tile[Constantes.ligne][Constantes.col];
		for(int i = 0; i < map.length; i ++) {
			for(int j = 0; j < map[i].length; j++) {
				switch(Constantes.getArbreOuVide()){
				case UNDEFINED:
					map[i][j] = new TerrainVide();
					break;
				case CHENE:
					map[i][j] = new Chene();
					break;
				case FRENE:
					map[i][j]= new Frene();
					break;
				case CHATAIGNER:
					map[i][j] = new Chataigner();
					break;
				}
			}
		}
	    int randCol  = (int)(Math.random()*((39 - 0) + 1)), 
			randLigne = (int)(Math.random()*((29 - 0) + 1));
		map[randLigne][randCol].prendFeu();
		
		return map;
	}
	public static Tile[][] getMap(){
		return map;
	}
}
