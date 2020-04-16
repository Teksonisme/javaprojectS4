package Grid_game;
import java.awt.Color;

import javax.swing.JFrame;

import java.awt.Graphics;

import java.awt.GraphicsConfiguration;

public class Main_of_game {
	
	Frame_of_game frame;
	GridLayout_game gl_g;
	
	public Main_of_game(int h,int w) {
		//this.frame = new Frame_of_game(h,w,this);
		this.gl_g = new GridLayout_game(h,w,this);
	}
	/**public void run(){
		while(true){
			try{Thread.sleep(5000);{}
			this.frame.repaint();
		}
	}*/
	public static void main(String[] args) {
		System.out.println("Hello");
		Main_of_game game = new Main_of_game(960,1280);
		//game.run();
	}

}
