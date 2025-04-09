package questao_03;

public class MemoriaRAM {
	private String marca;
	private int capacidadeGB;
	
	public MemoriaRAM(String marca, int capacidadeGB) {
		this.capacidadeGB = capacidadeGB;
		this.marca = marca;
	}
	
	public int getCapacidadeGB() {
		return capacidadeGB;
	}
	
	public void setCapacidadeGB(int capacidadeGB) {
		this.capacidadeGB = capacidadeGB;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
