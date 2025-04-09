package questao_05;
import java.util.List;
import java.util.ArrayList;
public class Departamento {
	private String nome;
	private List<Medico> medicos;
	
	public Departamento(String nome) {
		this.nome = nome;
		this.medicos = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Medico> getMedicos() {
		return medicos;
	}

	public void adicionarMedico(Medico medico) {
		medicos.add(medico);
	}
	
	public void removerMedico(Medico medico) {
		medicos.remove(medico);
	}
}
