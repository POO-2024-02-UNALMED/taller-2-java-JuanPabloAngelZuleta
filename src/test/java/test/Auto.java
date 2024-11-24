package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static String cantidadCreados;
	
	
	int cantidadAsientos(){
		int cantidadAsientos=0;
		for(int a=0; a<asientos.length; a++) {
			if(asientos[a]!=null) {
				cantidadAsientos++;				
			}
		}
		return cantidadAsientos;
	}
	
	
	String verificarIntegridad() {
		String mensaje = "Las piezas no son originales";
		if (asientos.length != 0) {
			if(registro == motor.registro) {
				int j = 0;
				for (int i = 0; i<asientos.length;i++) {
					if (asientos[i] != null) {
						if(registro == asientos[i].registro) {
							j++;
						}
					}
				}
				if (j == cantidadAsientos()) {
					mensaje = "Auto original";
				}
			}
		}
		return mensaje;
	}
}
