package lista8;

public abstract class Cachorro {
	
	private String raca;
	private String porte;
	
	public Cachorro(String raca, String porte) {
		this.raca = raca;
		this.porte = porte;
	}
	
	public abstract void latir();
}
