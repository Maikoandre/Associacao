package questao_02;
import java.util.List;
import java.util.ArrayList;

public class Exposicao {
	private String nome;
	private List<ObraDeArte> obrasDeArte;
	
	public Exposicao(String nome) {
		this.setNome(nome);
		this.obrasDeArte = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<ObraDeArte> getObrasDeArte() {
		return obrasDeArte;
	}
	public void setObrasDeArte(ObraDeArte obra) {
		obrasDeArte.add(obra);
	}
	
	public void listarObras() {
		System.out.println("Obras da exposição: ");
		for(ObraDeArte obra : obrasDeArte) {
			System.out.println(obra);
		}
	}
}
