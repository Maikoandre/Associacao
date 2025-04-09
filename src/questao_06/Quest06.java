package questao_06;

public class Quest06 {

	public static void main(String[] args) {
		Acessorio acessorio1 = new Acessorio("Som");
		Veiculo veiculo1 = new Veiculo("Carro");
		Concessionaria concessionaria1 = new Concessionaria("Jaião do Grau");
		
		veiculo1.adicionarAcessorio(acessorio1);
		concessionaria1.adicionarVeiculo(veiculo1);
		concessionaria1.exibirVeiculos();
	}

}
