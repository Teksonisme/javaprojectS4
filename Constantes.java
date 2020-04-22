package Grid_game;

import java.awt.Color;

public class Constantes {
	//
	static double probaArbre = 0.8;
	//Tableau map[Lignes][Colonnes]
	static int col = 40,ligne=30,hgap=0,vgap=0;
	// 
	static int resChataigner=1,resChene=2,resFrene=3;
	//
	static int perteVie = 5;
	static Color couleurFeu = new Color(255,69,0);
	public static int iPompierGenerate=0,jPompierGenerate=0;

	public static TypeArbre getArbreOuVide() {
		int randNum=Math.random()<probaArbre?1:0;
		if(randNum == 0) return TypeArbre.UNDEFINED;
		double randNumDbl=Math.random();
		if(randNumDbl <= 0.3 ) {
			return TypeArbre.CHENE;
		}
		else {
			if(randNumDbl <= 0.7) {
				return TypeArbre.CHATAIGNER;
			}
			return TypeArbre.FRENE;
		}
	}
}

