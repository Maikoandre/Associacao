package questao_05;
import java.util.ArrayList;
import java.util.List;
public class Hospital {
	private String nome;
	private List<Departamento> departamentos;
	
	public Hospital(String nome) {
		this.setNome(nome);
		this.departamentos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void adicionarDepartamento(Departamento departamento) {
		departamentos.add(departamento);
	}
	
	public void removerDepartamento(Departamento departamento) {
		departamentos.remove(departamento);
	}
	
	public void exibirDepartamentos() {
		System.out.println("Nome do hospital: " + nome);
		for(Departamento dep : departamentos) {
			System.out.println("Departamento: " + dep.getNome());
			System.out.println("Médicos: ");
			for(Medico med : dep.getMedicos()) {
				System.out.println(med.getNome());
			}
		}
	}
	
}
