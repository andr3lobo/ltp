package desafio.PPT;

public class AppJogo {

	public static void main(String[] args) {
		
		Jogo jogo = new Jogo(); //criar o jogo
		jogo.setNomeJogadores("Adrielly", "Hendriew");
		
		int vencedor = jogo.vencedorPartida("pedra", "papel");
		
		System.out.println("Vencedor: "+ vencedor);

	}

}
