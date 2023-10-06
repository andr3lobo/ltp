package calculadora;

import java.util.Scanner;

public class AppCalc {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int option = calc.menu();
		
		while( option != 6 ) {
			switch (option) {
			case 1:
				calc.somar();
				break;
			case 2:
				calc.subtrair();
				break;
			case 3:
				calc.dividir();
				break;
			case 4:
				calc.multiplicar();
				break;
			case 5:
				calc.ultimasOperacoes();
				break;
			case 6:
				break;				
			default:
				System.out.println("Informe opções válidas. \n");
				break;
			}
			
			option = calc.menu();
		}
	}

}