package exceptions;

import java.util.Scanner;

public class Throws {
public static void main(String[] args) {
		
		System.out.println("Entre com um n�mero decimal");
		try {
			double nume = lerNumero();
			System.out.println("Voc� digitou: " + nume);
		} catch (Exception e) {
			System.out.println("Entrada inv�lida");
			e.printStackTrace();
		}
	}

	public static double lerNumero() throws Exception {
		Scanner sc = new Scanner(System.in);
		double nume = sc.nextDouble();
		sc.close();
		return nume;
	}
}
