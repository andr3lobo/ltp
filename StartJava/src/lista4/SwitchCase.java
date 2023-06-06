package lista4;

public class SwitchCase {

	public static void main(String[] args) {
		
		String sinal = "verde";
		
		switch (sinal) {
		case "verde": {
			
			System.out.println("Prossiga!");
			break;
		}
		case "amarelo":{
			System.out.println("Atenção!");
			break;
		}
		case "vermelho":{
			System.out.println("Pare!");
			break;
		}
		default:
			System.out.println("Deu Ruim!");
			break;
		}
	}
}
