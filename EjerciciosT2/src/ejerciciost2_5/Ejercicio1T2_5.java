package ejerciciost2_5;

import java.util.Scanner;

public class Ejercicio1T2_5 {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a aprender a contar");
		System.out.println("Escriba un número entero:");
		numero = sc.nextInt();

		for (int i=1; i <= numero; i++) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
