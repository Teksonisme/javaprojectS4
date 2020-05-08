package Grid_game;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Pompier extends Tile {
	String etat;
	int health;
	int x,y,velX = 0, velY = 0;

	Pompier(int x,int y){
		super(x,y);
		this.etat="pompier";
		this.setImage();
	}
	public void setImage() {
		try{
			Image img = ImageIO.read(getClass().getResource("/images/img_pompier.png"));
			this.setIcon(new ImageIcon(img));
			System.out.println("image set");
		}catch(Exception e) {System.out.println(""+e);}
	}
	public void move(Tile[][] map) {
		
	}
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		switch(key){
		case KeyEvent.VK_RIGHT:
			velX = 1;
			break;		
		case KeyEvent.VK_LEFT:
			velX = -1;
			break;
		case KeyEvent.VK_UP:
			velY = -1;
			break;
		case KeyEvent.VK_DOWN:
			velX = 1;
			break;
		}
	}
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		switch(key){
		case KeyEvent.VK_RIGHT:
			velX = 0;
			break;		
		case KeyEvent.VK_LEFT:
			velX = 0;
			break;
		case KeyEvent.VK_UP:
			velY = 0;
			break;
		case KeyEvent.VK_DOWN:
			velX = 0;
			break;
		}
	}
	
	//etat methods
	public void mort() { this.setColor(new Color(192, 192, 192)); }
	public String getEtat() { return this.etat; }
	public void prendFeu() { this.mort(); }

	//health methods
	public void setHealth(int h) { this.health-=h;}
	public int getHealth() { return this.health; }
	
	public void setHealthFeu(int h) { }
	public int getHealthFeu() { return 0;}
	
	public int getHealthRes() { return 999999; }
	public void setHealthRes(int h) {}	
	
	public TypeArbre getType() { return null; }
}
