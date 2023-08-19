package sistemasOO;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private int idade;
	
	private Carro carro;
	
	public Pessoa (String nome, String cpf, int idade) {
		this.nome=nome;
		this.cpf = cpf;
		this.idade=idade;
	}
	
	public void ligarCarro() {
		this.carro.ligar();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	
	

}
