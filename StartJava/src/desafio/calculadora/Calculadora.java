package desafio.calculadora;

import java.util.*;

public class Calculadora {
	
	Scanner leitor = new Scanner(System.in);//variavel para ler informações do teclado
	
	private Deque<String> history = new ArrayDeque<String>();//histórico das 10 operações mais recentes
	private String resultado = "";//resultado da última operação
	
	private double num1;//primeiro número da operação
	private double num2;//segundo número da operação
	
	public Calculadora() {}//método construtor vazio
	
	public int menu() {//retorna a opção informada pelo usuário	
		String menu = "\n#### Calculadora ####\n"
		+ this.resultado + "\n"
		+"Informe a opção desejada:\n"
		+ "1 - Somar\n"
		+ "2 - Subtrair\n"
		+ "3 - dividir\n"
		+ "4 - Multiplicação\n"
		+ "5 - Histórico\n"
		+ "6 - Sair\n";
		
		System.out.println(menu);
		return leitor.nextInt();
	}
	
	public void somar() {
		this.num1 = capturaNumero("primeiro");
		this.num2 = capturaNumero("segundo");
		setResultado("soma", this.num1+this.num2);
		
		if (this.history.size()>= 10) {
			this.history.remove();
		}
		this.history.add("Operação: Soma Números: "+this.num1+" e "+this.num2+" Resultado: "+(this.num1+this.num2));
				
	}
	
	public void subtrair() {
		this.num1 = capturaNumero("primeiro");
		this.num2 = capturaNumero("segundo");
		setResultado("subtração", this.num1 - this.num2);
		
		if (this.history.size()>= 10) {
			this.history.remove();
		}
		this.history.add("Operação: Soma Números: "+this.num1+" e "+this.num2+" Resultado: "+(this.num1 - this.num2));
	}
	
	public void dividir() {
		this.num1 = capturaNumero("primeiro");
		this.num2 = capturaNumero("segundo");
		setResultado("divisão", this.num1/this.num2);
		
		if (this.history.size()>= 10) {
			this.history.remove();
		}
		this.history.add("Operação: Soma Números: "+this.num1+" e "+this.num2+" Resultado: "+(this.num1/this.num2));
	}
	
	public void multiplicar() {
		this.num1 = capturaNumero("primeiro");
		this.num2 = capturaNumero("segundo");
		setResultado("multiplicação", this.num1*this.num2);
		if (this.history.size()>= 10) {
			this.history.remove();
		}
		this.history.add("Operação: Soma Números: "+this.num1+" e "+this.num2+" Resultado: "+(this.num1*this.num2));
	}
	
	/*
	 * método atualiza o resultado da última operação para ser exibida, conforme requisito do problema
	 */
	private void setResultado (String operacao, double r) {
		this.resultado = "### Resultado da "+operacao+": "
						 +r+"###\n";
	}
	
	private double capturaNumero(String s) {
		System.out.println("\nDigite o "+s+" número: ");
		return leitor.nextDouble();
	}

	public void ultimasOperacoes() {
		for (Iterator it = this.history.iterator();it.hasNext();) {
			System.out.println((String) it.next());
		}
	}
	
}
