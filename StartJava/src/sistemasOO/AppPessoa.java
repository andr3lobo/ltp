package sistemasOO;

public class AppPessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Damaris","012928",18);
		
		Carro meuCarro = new Carro();
		meuCarro.setCor("branca");
		meuCarro.setNome("BMW X6");
		meuCarro.setPortas(6);
		
		p1.setCarro(meuCarro);
		meuCarro.setDono(p1);
		
		p1.ligarCarro();
		
		
		
	}

}
