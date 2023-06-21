package poo;

public class SinucaApp {

	public static void main(String[] args) {
		Bola b8 = new Bola("fubica", 8, "Mesa");
		Bola b1 = new Bola("bolaComum", 1, "Mesa");
		Bola b2 = new Bola("bolaComum", 2, "Mesa");
		
//		System.out.println("Tipo: " + b1.tipo
//				+ " Número: " + b1.numero);
		
		System.out.println("Tipo: " + b2.tipo
				+ " Número: " + b2.numero + " Estado: "+b2.estado);
		
//		System.out.println("Tipo: " + b8.tipo
//				+ " Número: " + b8.numero);
		
		b2.encacapar();
		
		System.out.println("Tipo: " + b2.tipo
				+ " Número: " + b2.numero + " Estado: "+b2.estado);
		

	}

}
