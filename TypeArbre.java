package Grid_game;

public enum TypeArbre {
	UNDEFINED(0),
	CHENE(1),
	FRENE(2),
	CHATAIGNER(3);
	private final int value;
	TypeArbre(int value){
		this.value=value;
	}
	public int getValue() {
		return this.value;
	}
}
