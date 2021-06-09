
public class Cliente {
	private static int num_de_clientes;
	private static int lucro;
	private static int num_vendas;
	private int id_cliente;
	private int vendas_cliente;
	
	public Cliente(int id_cliente){
		this.id_cliente = id_cliente;
		System.out.println("Cliente "+id_cliente+" criado");
		num_de_clientes++;
		System.out.println("Número de clientes:"+num_de_clientes);
	}
	
	public void Compra(int valor_pago) {
		lucro += valor_pago;
		System.out.println("Lucro:"+lucro+"\nComprador:"+id_cliente);
		num_vendas++;
		System.out.println("Número de vendas:"+num_vendas);
	}
	
	public static int Roupa(int num_roupa){
		return num_roupa;
	}
	
}

