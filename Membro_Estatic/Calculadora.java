
public class Calculadora {
	private static float result;
	
	public static void Soma(int num1,int num2) {
		result=num1+num2;
		System.out.println("O resultado de: "+num1+"+"+num2+" é: "+result);
	}
	public static void Divi(float num1,float num2) {
		result=num1/num2;
		System.out.println("O resultado de: "+num1+"/"+num2+" é: "+result);
	}
	public static void Mult(int num1,int num2) {
		result=num1*num2;
		System.out.println("O resultado de: "+num1+"*"+num2+" é: "+result);
	}
	public static void Subt(int num1,int num2) {
		result=num1-num2;
		System.out.println("O resultado de: "+num1+"-"+num2+" é: "+result);
	}
}
