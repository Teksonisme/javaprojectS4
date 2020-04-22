package Grid_game;

import java.awt.*;
import javax.swing.JFrame;

import Grid_game.Constantes;

public class GridLayout_game extends JFrame {
	Main_of_game game;
	public Tile[][] map;
	Panel c;
	GameManager gm;

	public GridLayout_game(int h, int w, Main_of_game game) {
		// Donne le titre de la fenêtre
		super("GridLayout_game");
		this.game = game;
		// Création du panel
		Panel c = new Panel();

		// Création des dimensions du grid/ ajout de la couleur de fond
		c.setLayout(new GridLayout(Constantes.ligne, Constantes.col, Constantes.hgap, Constantes.vgap));
		c.setBackground(Color.white);
		this.c = c;
		this.gm = new GameManager();
		map = gm.getMap();
		game.map = map;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				c.add(map[i][j]);
			}
		}
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(c);
		this.pack();
		this.setSize(w, h);
		this.setResizable(false);
		this.setVisible(true);
		
	}

}
