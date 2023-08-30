package lista6;

public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	
	private String key = "789";
	
	public Pessoa(String n, String cpf, int i) {
		this.nome = n;
		this.cpf=cpf;
		this.idade=i;
	}
	
	public void papelReuniaoIFMT() {
		System.out.println("Modo de Participação: Ouvinte\n");
	}
	
	@Override
	public String toString() {
		return "Nome: "+this.nome+"\n"+
				"CPF: "+this.cpf+"\n"+
				"Idade: "+this.idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome, String senha) {
		if (this.key.equals(senha)) {
			this.nome = nome;
			System.out.println("Nome alterado com sucesso!");
		} else {
			System.out.println("Não foi possível "
					+ "alterar o nome!");
		}
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
}
