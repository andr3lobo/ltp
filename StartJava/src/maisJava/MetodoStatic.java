package maisJava;

import java.util.ArrayList;
import java.util.Date;

public class MetodoStatic {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Pastor","Safira");
		dog.setNome("Safira 2");

		Cachorro.imprimirAtributos();//static
		
		Pinsher p = new Pinsher("Pinsher", "Dudu");
		p.updateName("Dudu 2");
		
		p.latir();
		
		
		
	}

}
