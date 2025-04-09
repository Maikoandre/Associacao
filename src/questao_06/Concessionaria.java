package questao_06;
import java.util.List;
import java.util.ArrayList;

public class Concessionaria {
	private String nome;
	private List<Veiculo> veiculos;
	
	public Concessionaria(String nome) {
		this.setNome(nome);
		this.veiculos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Veiculo> getVeiculo() {
		return veiculos;
	}

	public void adicionarVeiculo(Veiculo veiculo) {
		veiculos.add(veiculo);
	}
	
	public void removerVeiculo(Veiculo veiculo) {
		veiculos.remove(veiculo);
	}
	
	public void exibirVeiculos() {
		System.out.println("Nome da concessionária: " + nome);
		for(Veiculo vel : veiculos) {
			System.out.println("Tipo de veículo: " + vel.getTipoVeiculo());
			System.out.println("Acessórios do veículo: ");
			for(Acessorio ace : vel.getAcessorios()) {
				System.out.println(ace.getTipoAcessorio());
			}
		}
	}
}
