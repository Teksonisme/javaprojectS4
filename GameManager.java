package Grid_game;

public class GameManager {
	
	TileGrid map;
	GameManager(){
		this.initGame();
	}
	public void initGame() {
		map.generateMap();
		int randCol =(int)(Math.random()*((39 - 0) + 1)), randLigne= (int)(Math.random()*((29 - 0) + 1));
		
	}
	public Tile[][] getMap(){
		return this.map.getMap();
	}
	/**public updateMap() {
	}*/
}
