//import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Integer valores[] = new Integer[9];
		//Scanner sc = new Scanner(System.in);
		System.out.println("Digites valores inteiros: ");
		for(int x=0; x<9;x++) {
			valores[x]= x; //sc.nextInt();
		}
		System.out.println("\nValores: ");
		for(int x=0; x<9;x++) {
			System.out.println(valores[x]);
		}
		for(int x=0; x<9;x++) {
			valores[x]=x*3;
		}
		System.out.println("\nValores *3: ");
		for(int x=0; x<9;x++) {
			System.out.println(valores[x]);
		}
		//sc.close();
	}
}
