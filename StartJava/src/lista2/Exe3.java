package lista2;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		// criar uma variável para armazenar o salário
		System.out.println("Digite o salario: ");
		double salario =ler.nextDouble(); 
		//criar uma variável para armazenar o reajuste
		System.out.println("Digite o percentual % de reajuste: ");
		double r = (ler.nextDouble())/100;
		salario = r*salario+salario;
		
		System.out.println("O salario com o reajuste de "+
		r+" % é: "+salario);
		//imprimir
	}

}
