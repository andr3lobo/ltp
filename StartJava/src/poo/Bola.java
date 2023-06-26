package poo;

public class Bola {
	String cor;
	int numero;
	String tipo;
	String estado;// mesa ou caçapa
	
	public Bola(String t, int n, String e) {
		this.tipo = t;
		this.numero = n;
		this.estado = e;
	}
	
	public void encacapar() {
		this.estado = "Caçapa";
	}
	
	public void mudarEstado() {
		
		if (this.estado.equals("mesa")) {
			this.estado = "caçapa";
			
		} else {
			
		}
	}
	
	
}
