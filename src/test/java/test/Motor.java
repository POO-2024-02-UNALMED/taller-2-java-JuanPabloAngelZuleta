package test;

public class Motor {
	int nueroCilindros;
	String tipo;
	int registro;
	
	
	public void cambiarRegistro(int numero){
		this.registro=numero;
	}
	public void asignarTipo(String tipo){
		if (tipo=="electrico" ||tipo=="gasolina") {
			this.tipo=tipo;
		}
	}
	
	
}