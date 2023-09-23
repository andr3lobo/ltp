package desafio.estudante.atividades;

import java.util.ArrayList;

public class Disciplina {
	
	String nome;
	String ementa;
	int ch;//carga horária
	ArrayList<Atividade> atividades;//lista de atividades do professor
	
	public Disciplina(String nome, String ementa, int ch) {
		this.nome = nome;
		this.ementa = ementa;
		this.ch = ch;
	}
	
	

}
