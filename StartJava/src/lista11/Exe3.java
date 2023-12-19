package lista11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.AbstractDocument.BranchElement;

public class Exe3 {

	public static void main(String[] args) throws IOException {
		File arquivo = new File("/Users/andrelobo/Documents/TesteLeitura/grupotrabalhos.txt");
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		try {
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);
			
			while(br.ready()) {
				nomes.add(br.readLine());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for (String n : nomes) {
			System.out.println("Integrante: "+ n);
		}

	}

}
