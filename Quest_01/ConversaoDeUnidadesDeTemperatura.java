
public class ConversaoDeUnidadesDeTemperatura {//foram usadas duas maneiras diferentes de fazer o exercício
	private static double f;//optei por double para dar um resultado preciso
	
	public static double ConvertFahrenheit(double f) {//maneira mais comum, onde há o retorno do valor
		 return ((f-32)*5/9);//retorna o valor do calculo
	}
	
	public static void ConvertCelsius(double c) { //não há retorno de valor (void), o valor é exibido pelo próprio método
		 f = ((9*c/5) +32); //recebe o valor e calcula
		 System.out.println("O valor de "+c+"°C em graus fahrenheit é "+f+"°F");//exibe o valor no próprio método estático
	}
}
