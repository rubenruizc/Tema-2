package ejerciciost2_3;

import java.util.Scanner;

public class Ejercicio3T2_3 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos los números del usuario
		float num;

		// Variable donde guardaremos la suma de los números
		float media = 0;

		float contador = 0;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos un número al usuario y le explicamos el ejercicio
		System.out.println("Introduzca un número.Valor negativo para salir.");

		// Leemos el número
		num = sc.nextInt();

		// Mientras el número que se introduzca sea positivo seguimos
		while (num >= 0) {

			// Operación para sumar los números
			media += num; // suma = suma + num
			
			//Operación para contar los números
			contador++;

			// Le pedimos un número al usuario y le explicamos el ejercicio
			System.out.println("Introduzca un número.Valor negativo para salir.");

			// Leemos el número
			num = sc.nextInt();

		}

		// Mostramos la nota media del usuario
		System.out.println("Su nota media es : " + media / contador);

		// Cerramos el Scanner
		sc.close();

	}// Cierre main

}// Cierre clase
