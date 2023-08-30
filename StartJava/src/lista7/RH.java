package lista7;

public class RH {
	
	private int qtdFuncionario;//quantidade de funcionarios da empresa
	private int qtdBonificacoes;//quantidade de bonificações realizadas
	private double totalSalarios;
	
	public RH() {
		this.qtdBonificacoes=0;
		this.qtdFuncionario=0;
		this.totalSalarios=0;
	}
	
	public void addFuncionario(Funcionario f) {
		if (! f.getNome().equals(null) ) {
			this.qtdFuncionario+=1;
		}
	}
	
	public void addBonificacoes(Funcionario f) {
		if (! f.getNome().equals(null) ) {
			this.qtdBonificacoes+=1;
		}
		
	}
	
	
	public void addSalario(Funcionario f) {
		this.totalSalarios = this.totalSalarios + f.getSalario();
	}

	public int getQtdFuncionario() {
		return qtdFuncionario;
	}

	public void setQtdFuncionario(int qtdFuncionario) {
		this.qtdFuncionario = qtdFuncionario;
	}

	public int getQtdBonificacoes() {
		return qtdBonificacoes;
	}

	public void setQtdBonificacoes(int qtdBonificacoes) {
		this.qtdBonificacoes = qtdBonificacoes;
	}	

}
