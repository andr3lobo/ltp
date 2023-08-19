package maisJava;

public class Cachorro {
	
	private String raca;
	protected String nome;
	
	public Cachorro(String raca, String nome) {
		this.raca = raca;
		this.nome = nome;
	}
	
	public void latir() {
		System.out.println("Au-Au");
	}
	
	public static void imprimirAtributos() {
		System.out.println("[Raça, Nome]");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
