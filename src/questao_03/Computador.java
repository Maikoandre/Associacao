package questao_03;

public class Computador {
	private String marca;
	private MemoriaRAM memoria;
	private DiscoRigido disco;
	private Processador processador;
	
	public Computador(String marca, String marcaRam, int capacidadeGBRam,  String marcaDsico, int capacidadeGBDisco, String marcaPro, String modeloPro) {
		this.setMarca(marca);
		this.setMemoria(new MemoriaRAM(marcaRam, capacidadeGBRam));
		this.setDisco(new DiscoRigido(marcaDsico, capacidadeGBDisco));
		this.setProcessador(new Processador(marcaPro, modeloPro));
	}
	@Override
	public String toString() {
		System.out.println();
		System.out.println();
		return "Especificações: \n" + "Marca: " + this.getMarca() + "\n" +
		"Memoria RAM - Capacidade: " + memoria.getCapacidadeGB() + " GB\n" +
		"Disco rigido - Capacidade: " + disco.getCapacidadeGB() + " GB\n" +
		"Processador - Marca: " + processador.getMarca() + ", Modelo: " + processador.getModelo();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public MemoriaRAM getMemoria() {
		return memoria;
	}

	public void setMemoria(MemoriaRAM memoria) {
		this.memoria = memoria;
	}

	public DiscoRigido getDisco() {
		return disco;
	}

	public void setDisco(DiscoRigido disco) {
		this.disco = disco;
	}

	public Processador getProcessador() {
		return processador;
	}

	public void setProcessador(Processador processador) {
		this.processador = processador;
	}
}
