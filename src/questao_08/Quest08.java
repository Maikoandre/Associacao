package questao_08;

public class Quest08 {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Marcos");
		Pedido pedido = new Pedido(cliente);
		pedido.adicionarItem("Pizza");
		Restaurante rest = new Restaurante();
		rest.adicionarPedido(pedido);
		rest.listarPedidosDeCliente(cliente);
	}

}
