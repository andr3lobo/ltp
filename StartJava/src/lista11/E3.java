package lista11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class E3 {

	public static void main(String[] args) throws IOException {
		File arquivo = new File("/Users/andrelobo/Documents/grupotrabalhos.txt");
		ArrayList<String> nomes = new ArrayList<String>();
		
		FileReader fr = new FileReader(arquivo);
		BufferedReader br = new BufferedReader(fr);
		
		while (br.ready()) {
			nomes.add( br.readLine() );
		}
		br.close();
		fr.close();
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println("Integrante "+(i+1)+": "+nomes.get(i));
		}
	}

}
