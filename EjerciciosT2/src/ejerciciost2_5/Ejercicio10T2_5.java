package ejerciciost2_5;

import java.util.Scanner;

public class Ejercicio10T2_5 {

	public static void main(String[] args) {
		int numeroA;
		int numeroB;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba un número: ");
		numeroA = sc.nextInt();
		do {
			System.out.println("Escriba otro número mayor que el anterior: ");
			numeroB = sc.nextInt();
		} while (numeroB < numeroA);
		System.out.print("Los números entre A y B son: ");
		for (int i = numeroA; i <= numeroB; i++) {
			System.out.print(i);

		}
		sc.close();

	}

}
