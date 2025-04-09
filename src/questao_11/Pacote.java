package questao_11;
import java.util.LinkedList;
public class Pacote {
	private String nomePacote;
	private LinkedList<Destino> destinos;
	private LinkedList<GuiaTuristico> guias;
	
	public Pacote(String nomePacote) {
		this.setNomePacote(nomePacote);
		this.destinos = new LinkedList<>();
		this.guias = new LinkedList<>();
	}
	
	public void adicionarDestino(Destino destino) {
		destinos.add(destino);
	}
	
	public void removerDestino(Destino destino) {
		destinos.remove(destino);
	}
	
	public LinkedList<Destino> getDestinos(){
		return destinos;
	}
	
	public void adicionarGuia(GuiaTuristico guia) {
		guias.add(guia);
	}
	
	public void removerGuia(GuiaTuristico guia) {
		guias.remove(guia);
	}
	
	public LinkedList<GuiaTuristico> getGuias(){
		return guias;
	}
	
	public String getNomePacote() {
		return nomePacote;
	}
	public void setNomePacote(String nomePacote) {
		this.nomePacote = nomePacote;
	}
	
	
}
