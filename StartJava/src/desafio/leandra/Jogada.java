package desafio.leandra;
public class Jogada{
	
	/** Atributos
	 * */ 
	private String nomeJogadorA;
	private String nomeJogadorB;
	
	/** Métodos
	 * */ 
	
	// método construtor
	public Jogada(){};
	
	
	// método que atribui o nome dos jogadores
	public void setNomeJogadores(String jogadorA, String jogadorB) {
		this.nomeJogadorA = jogadorA;
		this.nomeJogadorB=jogadorB;
	}
	
	// método que retorna o nome do jogador A=
	public String getNomeJogadorA() {
		return this.nomeJogadorA;
	}
	
	// método que retorna o nome do jogador A=
		public String getNomeJogadorB() {
			return this.nomeJogadorB;
		}
	
	// método que retorna o nome do jogador B

//	int vencedor = jogada.vencedorPartida("pedra", "papel");
//
//
//	System.out.println("Vencedor: "+ vencedor);
}