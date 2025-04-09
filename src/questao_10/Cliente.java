package questao_10;
import java.util.LinkedList;

public class Cliente {
	private String nome;
	private double saldo;
	private LinkedList<Produto> produtos;
	
	public Cliente(String nome, double saldo) {
		this.setNome(nome);
		this.setSaldo(saldo);
		this.produtos = new LinkedList<Produto>();
	}
	
	public LinkedList<Produto> getProdutos(){
		return produtos;
	}
	
	public void comprarProduto(Produto produto, int quant) {
		if((produto.getPreco() * quant) > this.getSaldo()) {
			System.out.println("Saldo insuficiente.");
			return;
		}
		this.setSaldo(this.getSaldo() - (produto.getPreco() * quant));
		produtos.add(produto);
		
	}
	
	public void listarProdutos() {
		System.out.println("Produtos comprados: ");
		for(Produto prod : produtos) {
			System.out.println(" - " + prod.getNome());
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
