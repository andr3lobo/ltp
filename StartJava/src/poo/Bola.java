package poo;

public class Bola {
	String cor;
	int numero;
	String tipo;
	String estado;
	
	public Bola(String t, int n, String e) {
		this.tipo = t;
		this.numero = n;
		this.estado = e;
	}
	
	public void encacapar() {
		this.estado = "Caçapa";
	}
	
	
}
