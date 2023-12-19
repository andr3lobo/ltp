package desafio.leandra;

public class Appjogada {

	
	public static void main (String[] args) {
		
		
        String jogada1 = "Leandra";
		String jogada2 = "Júlia";
		
		Jogada jogada = new Jogada(); // criar o jogo
		
		jogada.setNomeJogadores(jogada1,jogada2);// atribui o nome dos jogadores
		System.out.println(jogada.getNomeJogadorA());
		System.out.println(jogada.getNomeJogadorB());
		
		
		
//	    String opçao1, opçao2, opçao3; 
//	    String pedra, papel, tesoura;
//	
//	  
//	
//        System.out.print("digite uma opçao");
//	    opçao1 = jogada1;
//	    System.out.print("digite uma segunda opçao");
//	    opçao2 = jogada2;
//	   
//	    			
//	    if (args[0].equals(opçao1)); 
//		System.out.print("papel ganhou");
//
//		if (args[1].equals(opçao2)); 
//	    System.out.print("pedra ganhou");
//	 
//	    if(args[2].equals(opçao3));
//		System.out.print("tesoura ganhou");
//		
    
	}
}