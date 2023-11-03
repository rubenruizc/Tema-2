package ejerciciost2_5;

import java.util.Scanner;

public class Ejercicio7T2_5 {

	public static void main(String[] args) {
		int numero;
		int multiplicacion = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un número y escribiremos su factorial: ");
		numero = sc.nextInt();
		for (int i = numero; i > 0; i--) {
			System.out.print(i != 1 ? i + " x " : i + " = ");
			multiplicacion *= i;
		}
		System.out.print(multiplicacion);
		sc.close();
	}

}
