package questao_09;
import java.util.List;
import java.util.ArrayList;

public class Aluno {
	private String matricula;
	private String nome;
	private List<Curso> cursos;
	
	public Aluno(String matricula, String nome) {
		this.setMatricula(matricula);
		this.setNome(nome);
		this.cursos = new ArrayList<>();
	}
	
	public void matricularCurso(Curso curso){
		cursos.add(curso);
	}
	
	public void cancelarMatricula(Curso curso) {
		cursos.remove(curso);
	}
	
	public List<Curso> getCursos(){
		return cursos;
	}
	
	public void listarCursos() {
		System.out.println("Cursos que o aluno faz: ");
		for(Curso curso : cursos) {
			System.out.println(" - " + curso);
		}
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
