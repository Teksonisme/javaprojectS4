package Grid_game;

import java.awt.Color;

public class Chene extends Arbre{
	Chene(){
		super(new Color(85,107,47),Constantes.resChene);	
	}
	public TypeArbre getType() {
		return TypeArbre.CHENE;
	}
}
