package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	
	public boolean cambiarColor(String NuevoColor) {
		String[] coloresp = {"rojo", "verde", "amarillo", "negro", "blanco"};
		for (String n: coloresp) {
			if (NuevoColor == n){
				this.color = n;
				return true;
			}
		}
	return false;
	}
	
	
}