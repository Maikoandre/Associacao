package questao_10;
import java.util.LinkedList;
public class Ecommerce {
	private String nome;
	private LinkedList<Vendedor> vendedores;
	
	public Ecommerce(String nome, double saldo) {
		this.setNome(nome);
		this.vendedores =  new LinkedList<Vendedor>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LinkedList<Vendedor> getVendedores(){
		return vendedores;
	}
	
	public void contratarVendedor(Vendedor vendedor) {
		vendedores.add(vendedor);
	}
	
	public void demitirVendedor(Vendedor vendedor) {
		vendedores.remove(vendedor);
	}
}
