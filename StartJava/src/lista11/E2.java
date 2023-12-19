package lista11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class E2 {

	public static void main(String[] args) throws IOException {
		
		String integrante1 = "André Assis\n";
		String integrante2 = "Joãozinho Silva\n";
		String integrante3 = "Mariazinha Ferreira\n";
		String integrante4 = "José Silva";
		
		File arquivo = new File("/Users/andrelobo/Documents/grupotrabalhos.txt");
		
		FileWriter fw = new FileWriter(arquivo);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(integrante1);
		bw.write(integrante2);
		bw.write(integrante3);
		bw.write(integrante4);
		bw.close();
		fw.close();
		

	}

}
