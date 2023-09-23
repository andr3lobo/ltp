package desafio.estudante.atividades;

public interface Coordenador {
	
	void criarTurma();
	void cadastrarProfessor(Professor p, Disciplina d, Turma t);
	void cadastrarEstudantes(Estudante e, Turma t);
	
}
