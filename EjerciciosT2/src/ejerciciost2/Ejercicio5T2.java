package ejerciciost2;

import java.util.Scanner;

public class Ejercicio5T2 {

	public static void main(String[] args) {
		// Declaramos la variable donde guardaremos el primer número del usuario
		double numero1;
		// Declaramos la variable donde guardaremos el segundo número del usuario
		double numero2;
		// Declaramos la variable donde guardaremos el tercer número del usuario
		double numero3;
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario que nos diga un número
		System.out.println("Introduzca el primer número: ");
		// Leemos el número
		numero1 = sc.nextDouble();
		// Le pedimos al usuario que nos diga un número
		System.out.println("Introduzca el segundo número: ");
		// Leemos el número
		numero2 = sc.nextDouble();
		// Le pedimos al usuario que nos diga un número
		System.out.println("Introduzca el tercer número: ");
		// Leemos el número
		numero3 = sc.nextDouble();
		// Comprobamos que número es mayor que otro
		if (numero1 >= numero2 && numero1 >= numero3) {
			if (numero2 >= numero3) {
				System.out.println("Números ordenados de mayor a menor: " + numero1 + ", " + numero2 + ", " + numero3);
			} else {
				System.out.println("Números ordenados de mayor a menor: " + numero1 + ", " + numero3 + ", " + numero2);
			}
		} else if (numero2 >= numero1 && numero2 >= numero3) {
			if (numero1 >= numero3) {
				System.out.println("Números ordenados de mayor a menor: " + numero2 + ", " + numero1 + ", " + numero3);
			} else {
				System.out.println("Números ordenados de mayor a menor: " + numero2 + ", " + numero3 + ", " + numero1);
			}
		} else if (numero1 >= numero2) {
				System.out.println("Números ordenados de mayor a menor: " + numero3 + ", " + numero1 + ", " + numero2);
		} else {
				System.out.println("Números ordenados de mayor a menor: " + numero3 + ", " + numero2 + ", " + numero1);
		}
		 

		// Cerramos el Scanner
		sc.close();

	}// Cierre main

}// Cierre clase
