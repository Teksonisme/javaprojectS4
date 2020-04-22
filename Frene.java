package Grid_game;

import java.awt.Color;

public class Frene extends Arbre{
	Frene(int x,int y){
		super(new Color(107,142,35),Constantes.resFrene,x,y);	
	}
	public TypeArbre getType() {
		return TypeArbre.FRENE;
	}
}
