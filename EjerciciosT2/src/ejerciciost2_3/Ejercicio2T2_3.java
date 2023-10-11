package ejerciciost2_3;

import java.util.Scanner;

public class Ejercicio2T2_3 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos los números del usuario
		int num;

		// Variable donde guardaremos la suma de los números
		int suma = 0;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos un número al usuario y le explicamos el ejercicio
		System.out.println("Introduzca un número.Valor negativo para salir.");

		// Leemos el número
		num = sc.nextInt();

		// Mientras el número que se introduzca sea positivo seguimos
		while (num >= 0) {

			// Operación para sumar los números
			suma += 1; // suma = suma + num

			// Le pedimos un número al usuario y le explicamos el ejercicio
			System.out.println("Introduzca un número.Valor negativo para salir.");

			// Leemos el número
			num = sc.nextInt();
		}

		// Mostramos la suma de los números validos del usuario
		System.out.println("Ha introducido un total de : " + suma + " números");

		// Cerramos el Scanner
		sc.close();

	}// Cierre main

}// Cierre clase
