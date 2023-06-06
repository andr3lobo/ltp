package lista4;
import java.util.Scanner;
public class ExemploProva {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite sua idade em anos: ");
		int idade=ler.nextInt();
		int dias = idade*365;
		System.out.println("Sua idade em dias é: "+dias);
		
		if(idade >=18) {
			System.out.println("Inicie o processo para a carteira de motorista!");
		} else {
			System.out.println("Não possui idade para iniciar o processo da carteira de motorista!");
		}
	}
}