package lista4;

public class Exe4 {

	public static void main(String[] args) {
		long fatorial = 1;
		System.out.printf("O fatorial de %d é %d",0,fatorial);
		for (int i = 1; i<=10; i++) {
//			fatorial *= i;
			fatorial = fatorial * i;
			System.out.printf("\nO fatorial de %d é (%d) * %d = %d",i,i-1,i,fatorial);
		}
	}
}
