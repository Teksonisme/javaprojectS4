package Grid_game;

public class GameManager {

	GameManager() {
		this.initGame();
	}

	public void initGame() {
		TileGrid.generateMap();
	}

	public Tile[][] getMap() {
		return TileGrid.getMap();
	}

	public void updateMap() {
		TileGrid.updateMap();
	}
}
