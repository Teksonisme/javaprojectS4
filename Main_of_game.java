package Grid_game;

public class Main_of_game {

	GridLayout_game gl_g;
	GameManager gm;
	public Tile[][] map;

	public Main_of_game(int h,int w) {
		this.gl_g = new GridLayout_game(h,w,this);
	}
	public void run(int w,int h){
		while(true){
			try{Thread.sleep(500);{}}
			catch(InterruptedException e) {}
			//this.map = Main_of_game.updateMap(this.map);
			gl_g.gm.updateMap();
		}	
	}

	public static void main(String[] args) {
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		Main_of_game game = new Main_of_game(960,1280);
		System.out.println("Game launched !");
		game.run(960,1280);
	}

}
