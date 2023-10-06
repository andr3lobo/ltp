package desafio.PPT;

public class Jogo {
	
	private String jogador1;
	private String jogador2;
	
	public Jogo() {};
	
	/**
	 * @param op1 jogada do primeiro jogador
	 * @param op2 jogada do segundo jogador
	 * @return 1 caso o vencedor seja o primeiro player ou 2 caso seja o 2 player
	 */
	public int vencedorPartida(String op1, String op2) {
		
		int vencedor = 0;
		
		boolean pedra1 = false; if (op1.equals("pedra")) pedra1 = true;
		boolean papel1 = false;  if (op1.equals("papel")) papel1 = true;
		boolean tesoura1 = false; if (op1.equals("tesoura")) tesoura1 = true;

		
		boolean pedra2 = false; if (op2.equals("pedra")) pedra2 = true;
		boolean papel2 = false; if (op2.equals("papel")) papel2 = true;
		boolean tesoura2 = false; if (op2.equals("tesoura")) tesoura2 = true;	
		
		if (pedra1 && papel2) vencedor = 2;
		else if (pedra1 && tesoura2) vencedor=1;
		else if (pedra1 && pedra2) vencedor = 0;
		
		
		
		
		// Situação 1: op1 Pedra e op2 Papel = vencedor j2
		
		// Situação 2: op1 Pedra e op2 Tesoura = vencedor j1
		
		// Situação 3: op1 Pedra e op2 Pedra = jogada anulada
		
		
		return vencedor;
	}
	
	public void setNomeJogadores(String j1, String j2) {
		this.jogador1 = j1;
		this.jogador2 = j2;
	}

	public String getJogador1() {
		return jogador1;
	}

	public String getJogador2() {
		return jogador2;
	}
	
	
	
	
	
}
