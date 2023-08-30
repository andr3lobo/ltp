package lista5;

public class AppLampada {

	public static void main(String[] args) {
		
		Lampada l1 = new Lampada();
		
		Lampada l2 = new Lampada("Philips","Branca",80.00);
		
		l2.aumentarIntensidade(50);
		
		l2.ligar();
		l2.desligar();
		l2.setCor("Vermelha");	
		
		
		
		double a = l2.getIntensidade();
		
		if(a < 80) {
			l2.setIntensidade(a + 20);
		} 
		
		
		
//		double a = 80.00;
		
	}

}
