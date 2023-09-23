package desafio.estudante.atividades;

public class Atividade {
	
	private String tipo;//prova,exercicio,leitura
	private boolean entrega;//com entrega ou sem entrega?
	private boolean sincrona;//síncrona ou assíncrona
	private boolean ativa;//ativa ou encerrada
	
	
	public Atividade (String tipo, boolean entrega, boolean sincrona) {
		this.tipo=tipo;
		this.entrega=entrega;
		this.sincrona=sincrona;
		this.ativa=true;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public boolean isEntrega() {
		return entrega;
	}


	public void setEntrega(boolean entrega) {
		this.entrega = entrega;
	}


	public boolean isSincrona() {
		return sincrona;
	}


	public void setSincrona(boolean sincrona) {
		this.sincrona = sincrona;
	}


	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

}
