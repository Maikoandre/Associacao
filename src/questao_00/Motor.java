package questao_00;

public class Motor {
	private String fabricante;
	private double cilindrada;
	private String combustivel;
	
	public Motor(String fabricante, double cilindrada, String combustivel) {
		this.setFabricante(fabricante);
		this.setCilindrada(cilindrada);
		this.setCombustivel(combustivel);
	}
	
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public double getCilindrada() {
		return cilindrada;
	}
	
	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public String getCombustivel() {
		return combustivel;
	}
	
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	
}
