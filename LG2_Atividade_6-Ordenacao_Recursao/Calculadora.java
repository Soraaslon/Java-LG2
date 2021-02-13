
public class Calculadora {
	public static int fatorialRecursivo(int n) {
		if(n==0) {
			return 1;
		}
		return n* fatorialRecursivo(n-1);
	}
}
