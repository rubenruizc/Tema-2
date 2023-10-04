package ejerciciost2;

import java.util.Scanner;

public class Ejercicio4T2 {

	public static void main(String[] args) {

		// Variable donde guardamos el primer número del usuario
		int num1;
		
		// Variable donde guardamos el segundo número del usuario
		int num2;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que nos diga un número
		System.out.print("Escriba un número: ");
		
		// Leemos el número
		num1 = sc.nextInt();
		
		// Le pedimos al usuario que nos diga un número
		System.out.print("Escriba otro número: ");
		
		// Leemos el número
		num2 = sc.nextInt();
		
		// Se comprueba que número es mayor que otro o igual
		if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " es menor que " + num2);
		} else {
			System.out.println("Los dos números son iguales");
		}

		// Cerramos el Scanner
		sc.close();

	}// Fin del main

}// Fin clase
