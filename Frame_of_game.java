package Grid_game;

import javax.swing.JFrame;

import java.awt.*;


public class Frame_of_game extends JFrame{
	Main_of_game game;
	
	public Frame_of_game(int h,int w, Main_of_game game) {
		super("Feu de forêt");
		this.game = game;
		this.setBackground(Color.WHITE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(w,h);
		this.setResizable(false);
		this.setVisible(true);
	}
	public Frame_of_game(String s) {
		super(s);
	}
	
}
