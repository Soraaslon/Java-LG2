package exceptions;

public class Excessao {
	public static void main(String[] args) {
		
		try{
			
			int[] vector = new int[4];
			System.out.println("O COMEÇO !!!");
			vector[4] = 1;
			System.out.println("Não vou aparecer ;-;");
			
		} catch(ArrayIndexOutOfBoundsException exception){
			
			System.out.println("Deu ruim no vetor moço, vai lá checar");
			
		}
		System.out.println("Eu to AQUIII");
	}

}