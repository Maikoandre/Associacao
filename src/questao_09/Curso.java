package questao_09;
import java.util.List;
import java.util.ArrayList;
public class Curso {
	private String nome;
	private List<Professor> profs;
	private List<Aluno> alunos;
	
	public Curso(String nome) {
		this.setNome(nome);
		this.profs = new ArrayList<>();
		this.alunos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Professor> getProfessores() {
		return profs;
	}
			
	public void adicionarProfessor(Professor prof) {
		profs.add(prof);
	}
	
	public void removerProfressor(Professor prof) {
		profs.remove(prof);
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void removerAluno(Aluno aluno) {
		alunos.remove(aluno);
	}
}
