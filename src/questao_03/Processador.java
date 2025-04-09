package questao_03;

public class Processador {
	private String marca;
	private String modelo;
	
	public Processador(String marca, String modelo) {
		this.setMarca(marca);
		this.setModelo(modelo);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
