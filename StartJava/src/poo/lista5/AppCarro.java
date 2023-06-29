package poo.lista5;

public class AppCarro {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.setVelocidadeAtual(50);
		
		Carro c2 = new Carro("Chevrolet", "SPIN LTZ", "Prata");
		c2.setVelocidadeAtual(40);
		
		double mediaVelocidade = (c1.getVelocidadeAtual() + c2.getVelocidadeAtual())/2;
		System.out.println("A media de velocidade é: "+ mediaVelocidade);
		
		
		
	}

}
