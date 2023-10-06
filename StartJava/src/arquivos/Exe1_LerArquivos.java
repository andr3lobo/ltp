package arquivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Exe1_LerArquivos {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new FileReader("dados.txt"));
		while (in.hasNextLine()) {
		    String line = in.nextLine();
		    System.out.println(line);
		}

	}

}
