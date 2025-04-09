package questao_02;
import java.util.List;
import java.util.ArrayList;

public class Museu {
	private String nome;
	private List<Exposicao> exposicoes;
	
	public Museu(String nome) {
		this.setNome(nome);
		this.exposicoes = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setExposicao(Exposicao expo) {
		exposicoes.add(expo);
	}
	
	public void listarExposicoes(Exposicao exp) {
		System.out.println("Museu: " + this.getNome());
		for(Exposicao exposicao : exposicoes) {
			System.out.println("Exposição: " + exposicao.getNome());
			System.out.println("Obras da exposição: ");
			for(ObraDeArte obras : exposicao.getObrasDeArte()) {
				System.out.println(obras.getNome());
			}
		}
		
	}
	
	
}
