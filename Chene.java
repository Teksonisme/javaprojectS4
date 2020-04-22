package Grid_game;

import java.awt.Color;

public class Chene extends Arbre{

	Chene(int x,int y){
		super(new Color(85,107,47),Constantes.resChene,x,y);	
	}
	public TypeArbre getType() {
		return TypeArbre.CHENE;
	}
}
