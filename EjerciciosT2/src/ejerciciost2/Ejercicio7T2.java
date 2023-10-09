package ejerciciost2;

import java.util.Scanner;

public class Ejercicio7T2 {

	public static void main(String[] args) {

		// Declaramos la variable donde guardamos el número del usuario
		int num;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le explicamos al usuario en que consiste el ejercicio
		System.out.println("El ejercicio consiste en decirte cuantas cifras tiene su número.");
		
		// Le pedimos al usuario que nos diga un número entre 0 y 99.999
		System.out.print("Escriba un número comprendido entre 0 y 99.999: ");
		
		// Leemos el número
		num = sc.nextInt();
		
		// Comprobamos cuantas cifras tiene el número del usuario
		if (num >= 0 && num <= 9) {
			System.out.println("Su número tiene una única cifra.");
		} else if (num >= 10 && num <= 99) {
			System.out.println("Su número tiene dos cifras.");
		} else if (num >= 100 && num <= 999) {
			System.out.println("Su número tiene tres cifras.");
		} else if (num >= 1000 && num <= 9999) {
			System.out.println("Su número tiene cuatro cifras.");
		} else if (num >= 10000 && num <= 99999) {
			System.out.println("Su número tiene cinco cifras.");
		} else {
			System.out.println("Su número no se puede registrar, inténtelo de nuevo.");
		}

		// Cerramos el Scanner
		sc.close();

	}// Cierre del main

}// Cierre de la clase
