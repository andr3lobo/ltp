package lista11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Exe1_LeituraArquivo {

	public static void main(String[] args) {
		String ms = "";
		File arquivo = new File( "/Users/andrelobo/Documents/TesteLeitura/dados1.txt" );
		
		try {
			FileReader fr = new FileReader(arquivo);
			BufferedReader bf = new BufferedReader(fr);
			
			while (bf.ready()) {
				ms = bf.readLine();
			}
			System.out.println(ms);
			
			
		} catch (Exception e) {
			System.out.println("Não foi possível ler o arquivo");
		}
		

	}

}