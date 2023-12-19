package lista11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exe2_EscritaArquivo {

	public static void main(String[] args) {
		
		File arquivo = new File ( "/Users/andrelobo/Documents/TesteLeitura/grupotrabalhos.txt" );
		String integrante1 = "André Assis\n";
		String integrante2 = "Joãozinho Silva\n";
		String integrante3 = "Mariazinha Ferreira\n";
		String integrante4 = "José Silva";
		
		
		try {
//			if (!arquivo.exists()) {
//				arquivo.createNewFile();
//			}
			
			FileWriter fw = new FileWriter(arquivo, false);//ou true para append
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(integrante1);
			bw.write(integrante2);
			bw.write(integrante3);
			bw.write(integrante4);
			
			bw.newLine();
			bw.close();
			fw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}

}
