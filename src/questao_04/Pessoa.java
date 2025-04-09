package questao_04;

public class Pessoa {
	private String nome;
	private int idade;
	private Endereco endereco;
	
	public Pessoa(String nome, int idade, int numero, String rua, String bairro, String cidade, String estado) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setEndereco(new Endereco(numero, rua, bairro, cidade, estado));
	}
	
	public void exibirInfo() {
		System.out.println("Nome: " + this.getNome() +
							"\nIdade: " + this.getIdade() +
							"\nEndereço: " + this.getEndereco().getNumero() + ", " + this.getEndereco().getRua() + ", " +
							this.getEndereco().getBairro() + ", " + this.getEndereco().getCidade() +
							" - " + this.getEndereco().getEstado());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
