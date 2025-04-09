package questao_09;
import java.util.List;
import java.util.ArrayList;

public class Universidade {
	private String nome;
	private List<Curso> cursos;
	
	public Universidade(String nome) {
		this.cursos = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Curso> getCursos() {
		return cursos;
	}
	
	public void adicionarCurso(Curso curso) {
		cursos.add(curso);
	}
	
	public void removerCurso(Curso curso) {
		cursos.remove(curso);
	}
	
}
