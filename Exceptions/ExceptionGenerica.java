package exceptions;

public class ExceptionGenerica {
public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denominador = {2, 0, 4, 8, 0};
		
		for (int i=0; i<numeros.length; i++){
			try{
				System.out.println(numeros[i] + "/" + denominador[i] + " = " + (numeros[i]/denominador[i]));
			}
			catch(Exception e){
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

	}
}
