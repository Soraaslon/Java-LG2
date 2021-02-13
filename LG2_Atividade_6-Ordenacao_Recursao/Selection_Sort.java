import java.util.Random;
import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {

		int a[] = gerarVetor(10);
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void selectionSort(int a[]) {
		for (int d=0; d<a.length-1; d++){
			int menor = d;
			for(int e=d+1; e<a.length; e++) {
				if ((a[e])<(a[menor])) {
					menor = e;		
				}
				}
			trocar(a, d, menor);
			}
	}
	
	public static void trocar(int a[], int d, int menor) {
		int x= a[menor];
		a[menor]= a[d];
		a[d]=x;
	}
	
	public static int[] gerarVetor(int n) {
		int []a = new int [n];
		Random gerador = new Random();
		
		for(int i=0; i<n; i++) {
			a[i]= gerador.nextInt(100);
		}
		return a;
	}
}