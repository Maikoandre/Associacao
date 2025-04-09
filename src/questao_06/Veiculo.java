package questao_06;
import java.util.List;
import java.util.ArrayList;

public class Veiculo {
	private String tipoVeiculo;
	private List<Acessorio> acessorios;
	
	public Veiculo(String tipoVeiculo) {
		this.setTipoVeiculo(tipoVeiculo);
		this.acessorios = new ArrayList<>();
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public List<Acessorio> getAcessorios() {
		return acessorios;
	}

	public void adicionarAcessorio(Acessorio acessorio) {
		acessorios.add(acessorio);
	}
	
	public void removerAcessorio(Acessorio acessorio) {
		acessorios.remove(acessorio);
	}
}
