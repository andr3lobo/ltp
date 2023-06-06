package lista4;

public class Exe7 {

	public static void main(String[] args) {
		int x = 13;
		
		if(x%2==0) {
			x = x / 2 ;
		} else {
			x = 3 * x + 1 ;
		}
		
		while (x>0) {
			System.out.print(x+"-> ");
			x/=2;
		}
	}

}
