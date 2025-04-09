package questao_10;
import java.util.LinkedList;

public class Vendedor {
	private String nome;
	private LinkedList<Produto> produtos;
	
	public Vendedor(String nome) {
		this.setNome(nome);
		this.produtos = new LinkedList<Produto>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void comprarNovoProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public LinkedList<Produto> getProduto(){
		return produtos;
	}
	
	public void venderProduto(Produto produto, int quant) {
		produto.setEstoque(produto.getEstoque() - quant);
		System.out.println("Produto: " + produto.getNome() + " - Quantidade vendida: " + quant);
	}
	
	public void listarProdutos() {
		System.out.println("Produtos no estoque: ");
		for(Produto prod : produtos) {
			System.out.println(" - " + prod.getNome());
		}
	}
}
