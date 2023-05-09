package lista2;

import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {
		// armazenar o número
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o número para imprimir "
				+ "sucessor e antecessor");
		int num = ler.nextInt();
		
		System.out.println("Numero digitado:"+num+"\nSucessor: "
				+ (++num)+"\nAntecessor: "+(--num));

	}

}
