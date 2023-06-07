package lista4;

public class Exe5 {

	public static void main(String[] args) {
		int anterior= 0;
		int atual = 1;
		int x = 0;
		while(x<=20) {
			x+=1;
			System.out.print(anterior+" ");
			int proximo = anterior+atual;
			anterior = atual;
			atual=proximo;
		}
	}
}
