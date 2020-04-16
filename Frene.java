package Grid_game;

import java.awt.Color;

public class Frene extends Arbre{
	Frene(){
		super(new Color(107,142,35),Constantes.resFrene);	
	}
	public TypeArbre getType() {
		return TypeArbre.FRENE;
	}
}
