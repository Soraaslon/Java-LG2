
public class Loja {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(30);
		Cliente cliente2 = new Cliente(10);
		Cliente cliente3 = new Cliente(43);
		
		cliente2.Compra(300);
		cliente1.Compra(500);
		cliente3.Compra(450);
		
		System.out.println("O número de roupas atualmente é :" + Cliente.Roupa(37));
	}

}
