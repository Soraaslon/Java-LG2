package exceptions;

public class Excessao {
	public static void main(String[] args) {
		
		try{
			
			int[] vector = new int[4];
			System.out.println("O COME�O !!!");
			vector[4] = 1;
			System.out.println("N�o vou aparecer ;-;");
			
		} catch(ArrayIndexOutOfBoundsException exception){
			
			System.out.println("Deu ruim no vetor mo�o, vai l� checar");
			
		}
		System.out.println("Eu to AQUIII");
	}

}