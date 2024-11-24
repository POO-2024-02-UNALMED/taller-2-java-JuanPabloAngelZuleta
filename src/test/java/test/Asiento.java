package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	
	void cambiarColor(String color) {
		if (color=="blanco" ||color=="negro" ||color=="amarillo" ||color=="verde" ||color=="rojo") {
			this.color=color;
		}
	}
	

}
