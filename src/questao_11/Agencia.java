package questao_11;
import java.util.LinkedList;
public class Agencia {
	private String nomeAgencia;
	private LinkedList<Pacote> pacotes;
	
	public Agencia(String nomeAgencia) {
		this.setNomeAgencia(nomeAgencia);
	}
	
	public void adicionarPacote(Pacote pacote) {
		pacotes.add(pacote);
	}
	
	public void removerPacote(Pacote pacote) {
		pacotes.remove(pacote);
	}
	
	public LinkedList<Pacote> getPacotes(){
		return pacotes;
	}
	
	public String getNomeAgencia() {
		return nomeAgencia;
	}
	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}
	
	public void listarPacotes() {
		for(Pacote pac : pacotes) {
			System.out.println("Nome do pacote: " + pac.getNomePacote());
			System.out.println("Destinos do pacote: ");
			for(Destino dest : pac.getDestinos()) {
				System.out.println(" - " + dest.getNomeDestino());
			}
		}
	}
	
}
