package questao_09;
import java.util.List;
import java.util.ArrayList;

public class Professor {
	private String siape;
	private String nome;
	private List<Curso> cursos;
	
	public Professor(String siape, String nome) {
		this.setSiape(siape);
		this.setNome(nome);
		this.cursos = new ArrayList<>();
	}
	
	public void ministrarCurso(Curso curso) {
		cursos.add(curso);
	}
	
	public void deixarCurso(Curso curso) {
		cursos.add(curso);
	}
	
	public List<Curso> getCursos(){
		return cursos;
	}
	
	public void listarCursos() {
		System.out.println("Cursos ministrados: ");
		for(Curso curso : cursos) {
			System.out.println(" - " + curso);
		}
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
