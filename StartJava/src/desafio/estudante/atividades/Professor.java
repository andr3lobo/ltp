package desafio.estudante.atividades;

public class Professor extends Pessoa implements Coordenador{
	
	private String matricula;
	private boolean coordenador=false;
	
	public Professor(String nome, String cpf, int idade) {
		super(nome, cpf, idade);
	}
	
	@Override
	public void criarTurma() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrarProfessor(Professor p, Disciplina d, Turma t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrarEstudantes(Estudante e, Turma t) {
		// TODO Auto-generated method stub
		
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isCoordenador() {
		return coordenador;
	}

	public void setCoordenador(boolean coordenador) {
		this.coordenador = coordenador;
	}
}
