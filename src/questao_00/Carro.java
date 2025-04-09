package questao_00;

public class Carro {
	private String modelo;
	private int velocidadeMaxima;
	private int velocidadeAtual;
	private Motor motor;
	
	public Carro() {
		this.setModelo("Um carro qualquer");
		this.setVelocidadeMaxima(120);
		this.setVelocidadeAtual(0);
	}
	
	public Carro(String modelo, Motor motor) {
		this.setModelo(modelo);
		this.setMotor(motor);
	}
	
	public Motor getMotor() {
		return motor;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	
	public void ligarCarro() {
		System.out.println("O carro está ligado.");
	}
	
	public void desligarCarro() {
		System.out.println("O carro está desligado.");
	}
	
	public void acelerar(int veloc) {
		if(this.velocidadeAtual + veloc <= this.velocidadeMaxima) {
			this.velocidadeAtual += veloc;
			System.out.println("Acelerando. Velocidade atual: " + this.velocidadeAtual);
		}else {
			System.out.println("Velocidade máxima atingida! Velocidade atual: " + this.velocidadeAtual);
		}
	}
	
	public void reduzir(int veloc) {
		if(this.velocidadeAtual - veloc > 0) {
			System.out.println("Reduzindo. Velocidade atual: " + this.velocidadeAtual);
		}else {
			pararCarro();
		}
	}
	
	public void pararCarro() {
		this.velocidadeAtual = 0;
		System.out.println("Parando. Velocidade atual: " + this.velocidadeAtual);
	}
}
