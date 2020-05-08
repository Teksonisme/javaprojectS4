package Grid_game;

import Grid_game.Constantes;

public class TileGrid {

	public static Tile[][] map;

	// Génération d'une map aléatoire
	public static Tile[][] generateMap() {
		map = new Tile[Constantes.ligne][Constantes.col];
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if(i == Constantes.iPompierGenerate && j == Constantes.jPompierGenerate) {
					map[i][j] = new Pompier(i,j);
				}
				else {
					switch (Constantes.getArbreOuVide()) {
					case UNDEFINED:
						map[i][j] = new TerrainVide(i,j);
						break;
					case CHENE:
						map[i][j] = new Chene(i,j);
						break;
					case FRENE:
						map[i][j] = new Frene(i,j);
						break;
					case CHATAIGNER:
						map[i][j] = new Chataigner(i,j);
						break;
					}
				}
			}
		}
		int randCol = (int) (Math.random() * ((39 - 0) + 1)), randLigne = (int) (Math.random() * ((29 - 0) + 1));
		while (map[randLigne][randCol].getType() == TypeArbre.UNDEFINED) {
			randLigne = randLigne + 1 % Constantes.ligne;
		}
		map[randLigne][randCol].prendFeu();
		System.out.println("Nbr ligne : " + map.length);
		System.out.println("Nbr colonnes : " + map[0].length);
		System.out.println(""+map[4][4]);

		return map;
	}

	public static Tile[][] getMap() {
		return map;
	}
	//Actualisation de la map
	public static void updateMap() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (neighbourOrSelfOnFire(i, j) && map[i][j].getEtat() != "mort") {
					if (map[i][j].getHealthRes() == 0) {
						map[i][j].prendFeu();
					} else {
						map[i][j].setHealthRes(Constantes.perteVieRes);
					}
				}
			}
		}
	}
	public static void burning() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if(map[i][j].getEtat().equals("feu")) {
					map[i][j].setHealth(Constantes.perteVieArbre);
				}
				if(map[i][j].getHealth() == 0) {
					map[i][j].mort();
				}
			}
		}
	}
	public static boolean neighbourOrSelfOnFire(int i, int j) {
		if (i == 0) {
			switch (j) {
			case 0:
				// Coin haut gauche...
				return areaOnFire(i, i + 1, j, j + 1);
			case 39:
				// Coin haut droit...
				return areaOnFire(i, i + 1, j - 1, j);
			default:
				// Bord haut (sans les coins)...
				return areaOnFire(i, i + 1, j - 1, j + 1);
			}
		} else if (i == Constantes.ligne - 1) {
			switch (j) {
			case 0:
				// Coin bas gauche...
				return areaOnFire(i - 1, i, j, j + 1);
			case 39:
				// Coin bas droit...
				return areaOnFire(i - 1, i, j - 1, j);
			default:
				// Bord bas (sans les coins)...
				return areaOnFire(i - 1, i, j - 1, j + 1);
			}
		} else if (j == 0) {
			// Bord gauche (sans les coins)...
			return areaOnFire(i - 1, i + 1, j, j + 1);
		} else if (j == Constantes.col - 1) {
			// Bord droit (sans les coins)...
			return areaOnFire(i - 1, i + 1, j - 1, j);
		} else {
			// Partout sauf les bords et les coins...
			return areaOnFire(i - 1, i + 1, j - 1, j + 1);
		}
	}

	public static boolean areaOnFire(int lineMin, int lineMax, int columnMin, int columnMax) {
		for (int line = lineMin; line <= lineMax; line++) {
			for (int column = columnMin; column <= columnMax; column++) {
				if (map[line][column].getEtat() == "feu") {
					return true;
				}
			}
		}
		return false;
	}

}
