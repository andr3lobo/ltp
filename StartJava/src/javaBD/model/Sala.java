package javaBD.model;

public class Sala {
	
	private int numero;
	private String descricao;
	private boolean disponivel;
	
	public Sala(int numero, String descricao) {
		this.numero = numero;
		this.descricao = descricao;
	}
	
	public Sala() {}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
}
