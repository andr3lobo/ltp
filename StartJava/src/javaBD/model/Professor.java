package javaBD.model;

public class Professor {
	private int id;
	private String nome;
	private String senha;
	
	public Professor() {}
	
	public Professor (String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}

	public Professor(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
