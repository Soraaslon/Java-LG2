
public class Carro {
	private String modelo;
	private int ano_fabrica;
	private String marca;
	private static int num_carros;
	
	public Carro(String modelo, String marca) {
		this.modelo = modelo;
		this.marca = marca;
		num_carros++;
		System.out.println("N�mero de Carros: "+num_carros + "\nModelo: " + modelo + "\nMarca: "+ marca);
	}
}
