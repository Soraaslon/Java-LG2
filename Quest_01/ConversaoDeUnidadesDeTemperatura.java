
public class ConversaoDeUnidadesDeTemperatura {//foram usadas duas maneiras diferentes de fazer o exerc�cio
	private static double f;//optei por double para dar um resultado preciso
	
	public static double ConvertFahrenheit(double f) {//maneira mais comum, onde h� o retorno do valor
		 return ((f-32)*5/9);//retorna o valor do calculo
	}
	
	public static void ConvertCelsius(double c) { //n�o h� retorno de valor (void), o valor � exibido pelo pr�prio m�todo
		 f = ((9*c/5) +32); //recebe o valor e calcula
		 System.out.println("O valor de "+c+"�C em graus fahrenheit � "+f+"�F");//exibe o valor no pr�prio m�todo est�tico
	}
}
