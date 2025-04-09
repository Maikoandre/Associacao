package questao_03;

public class DiscoRigido {
	private String marca;
	private int capacidadeGB;
	
	public DiscoRigido(String marca, int capacidadeGB) {
		this.setMarca(marca);
		this.setCapacidadeGB(capacidadeGB);
	}


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCapacidadeGB() {
		return capacidadeGB;
	}

	public void setCapacidadeGB(int capacidadeGB) {
		this.capacidadeGB = capacidadeGB;
	}
	
	
	
}
