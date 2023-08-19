package maisJava;

import java.util.Iterator;

public class StringJava {

	public static void main(String[] args) {
		
		String str1 = "Luisa-Corbari:André:Lucas";
		String vec [] = str1.split(":");
		
		for (int i = 0; i < vec.length; i++) {
			System.out.println(vec[i]);
		}
		
		String nome1 ="André", nome2 = "Lôbo";
		String nomeCompleto = nome1.concat(nome2);

	}

}
