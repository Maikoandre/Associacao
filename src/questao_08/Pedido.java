package questao_08;
import java.util.List;
import java.util.ArrayList;
public class Pedido {
	private Cliente cliente;
	private List<Item> itens;
	
	public Pedido(Cliente cliente) {
		this.setCliente(cliente);
		this.itens = new ArrayList<>();
	}
	
	public List<Item> getItens() {
		return itens;
	}
	
	public void adicionarItem(String nome) {
		itens.add(new Item(nome));
	}
	
	public void removerItem(Item item) {
		itens.remove(item);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
