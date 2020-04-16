package Grid_game;

import java.awt.*;

import javax.swing.JFrame;

import Grid_game.Constantes;

public class GridLayout_game extends JFrame {
	Main_of_game game;
	public Tile[][] map;
	public GridLayout_game(int h,int w, Main_of_game game) {
		super("GridLayout_game");
		this.game = game;
		Panel c = new Panel();
		c.setLayout(new GridLayout(Constantes.ligne,Constantes.col,Constantes.hgap,Constantes.vgap));
		c.setBackground(Color.white);
		GameManager gm = new GameManager();
		map = gm.getMap();
		for(int i = 0; i < map.length; i ++) {
			for(int j = 0; j < map[i].length; j++) {
				c.add(map[i][j]);
			}
		}
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(c);
		this.pack();
		this.setSize(w,h);
		this.setResizable(false);
		this.setVisible(true);
	}
}
