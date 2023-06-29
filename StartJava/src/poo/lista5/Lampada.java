package poo.lista5;

public class Lampada {
	
	private String marca;
	private String cor;
	private double intensidade;
	
	private boolean estado;// true = Ligada | false = desligada
	private String tipo; // ex.: incandescentes; fluorescentes; halógenas; LEDs; HID
	
	//método construtor sem parâmetro
	public Lampada() {
	}
	
	//método construtor com parâmetros
	public Lampada(String m, String c, double i) {
		this.marca = m;
		this.cor = c;
		this.intensidade = i;
	}
	
	public void ligar() {
		this.estado = true;
		System.out.println("Lâmpada Ligada com intensidade: "+this.intensidade);
	}
	
	public void desligar() {
		this.estado = false;
		System.out.println("Lâmpada Desligada!!!");
	}
	
	
	public void aumentarIntensidade (double valor) {
		this.intensidade = this.intensidade + valor;
	}
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getIntensidade() {
		return intensidade;
	}

	public void setIntensidade(double intensidade) {
		this.intensidade = intensidade;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
