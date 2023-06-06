package lista4;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 3 números");
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		System.out.println("Números em ordem crescente:");
		if (a > b) {
			if (b > c) {
				System.out.println(c + " " + b + " " + a);
			} else if (a > c) {
				if (c > b) {
					System.out.println(b + " " + c + " " + a);
				} else if (b > a) {
					if (a > c) {
						System.out.println(c + " " + a + " " + b);
					} else if (b > c) {
						if (c > a) {
							System.out.println(a + " " + c + " " + b);
						} else if (c > a) {
							if (a > b) {
								System.out.println(b + " " + a + " " + c);
							} else if (c > b)
								if (b > a) {
									System.out.println(a + " " + b + " " + c);
								}
						}
					}
				}
			}
		}
	}
}