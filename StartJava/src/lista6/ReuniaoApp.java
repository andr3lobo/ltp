package lista6;

public class ReuniaoApp {
	
	public static void main(String[] args) {
		
		Pessoa t = new Pessoa("Thallys", "098.456.678-10", 16);
		t.setNome("Jhales", "789");
		
		//Polimorfismo
		Pessoa p1 = new Pessoa("André","017.908.981-16",37);
		p1.papelReuniaoIFMT();//pessoa comum
		Pessoa p2 = new Estudante("Felipe", "087.892.654-10", 17);
		p2.papelReuniaoIFMT();//estudante
		Pessoa p3 = new Professor("André Lôbo","890.875.172-18",37);
		p3.papelReuniaoIFMT();//professor
		
		Estudante p4 = new Estudante("José", "018.789.768.19", 18);		
		Professor p5 = new Professor("Maria", "818.889.968.24", 50);
	}
}
