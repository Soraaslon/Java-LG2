
public class Forma {

	public static void main(String[] args) {
		Retangulo re1 = new Retangulo(10, 20);
		
		System.out.println("Área: " + re1.getArea());
		System.out.println("Perimetro: " + re1.getPerimetro());
		
		System.out.println("Base: " + re1.getBase());
		System.out.println("Lado: " + re1.getLado());
		
		re1.setBase(35);
		re1.setLado(25);
		
		System.out.println("Base: " + re1.getBase());
		System.out.println("Lado: " + re1.getLado());
		
	}

}
