package lista11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E1 {

	public static void main(String[] args) throws IOException {
		
		File arquivo = new File("/Users/andrelobo/Documents/dados1.txt");
		
		try {
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);
			
			while(br.ready()) {
				String ms = br.readLine();
				System.out.println(ms);
			}
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Leitura do arquivo dados1.txt");
		}
		
		
		
	}

}
