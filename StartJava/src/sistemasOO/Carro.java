package sistemasOO;

public class Carro {
	
	private String nome;
	private String cor;
	private int portas;
	private Pessoa dono;
	
	public Carro() {
		
	}
	
	public void ligar() {
		System.out.println("O carro ligado!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}
	

}
