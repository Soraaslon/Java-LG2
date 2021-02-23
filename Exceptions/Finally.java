package exceptions;

public class Finally {
	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denominador = {2, 0, 4, 8, 0};
		
		for (int i=0; i<numeros.length; i++){
			try{
				System.out.println(numeros[i] + "/" + denominador[i] + " = " + (numeros[i]/denominador[i]));
			}
			catch(ArithmeticException e){
				System.out.println("N�o pode dividir por 0 :/");
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Posi��o inv�lida");
			}
			finally {
				System.out.println("Essa linha � impressa sempre ap�s o try ou catch");
			}
		}

	}

}

