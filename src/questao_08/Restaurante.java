package questao_08;
import java.util.List;
import java.util.ArrayList;

public class Restaurante {
	private List<Pedido> pedidos;
	
	public Restaurante() {
		this.pedidos =new ArrayList<>();
	}
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void adicionarPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public void removerPedido(Pedido pedido) {
		pedidos.remove(pedido);
	}
	
	public void listarPedidosDeCliente(Cliente cliente) {
		System.out.println("Pedidos do cliente " + cliente.getNome());
		for(Pedido ped : pedidos) {
			if(ped.getCliente().equals(cliente)) {
				System.out.println(" - " + ped.getItens());
				
			}
		}
	}
	
}
