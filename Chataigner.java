package Grid_game;
import java.awt.Color;

public class Chataigner extends Arbre{
	Chataigner(int x,int y){
		super(new Color(128,128,0),Constantes.resChataigner,x,y);	
	}
	public TypeArbre getType() {
		return TypeArbre.CHATAIGNER;
	}
}
