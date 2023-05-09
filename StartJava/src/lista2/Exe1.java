package lista2;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		int anos, meses, dias;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite quantos anos você tem: ");
		anos = ler.nextInt();
		
		System.out.println("Digite a quantidade de meses que completou após sua "
				+ "idade atual: ");
		meses=ler.nextInt();
		
		System.out.println("Digite a quantidade de dias que falta para seu "
				+ "aniversário considerando que fosse nesse mês: ");
		dias=ler.nextInt();
		
		int totalDias = anos*365+meses*30+dias;
		System.out.println("A sua idade em dias é: "+totalDias);
	}

}
