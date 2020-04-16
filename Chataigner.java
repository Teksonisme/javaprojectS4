package Grid_game;
import java.awt.Color;

public class Chataigner extends Arbre{
	Chataigner(){
		super(new Color(128,128,0),Constantes.resChataigner);	
	}
	public TypeArbre getType() {
		return TypeArbre.CHATAIGNER;
	}
}
