package ejerciciost2;

import java.util.Scanner;

public class Ejercicio6T2 {

	public static void main(String[] args) {
		// Declaramos la variable donde guardaremos el valor de a
		int a;

		// Declaramos la variable donde guardaremos el valor de b
		int b;

		// Declaramos la variable donde guardaremos el valor de c
		int c;

		// Declaramos la variable donde guardaremos el valor del primer resultado
		double resultado1;

		// Declaramos la variable donde guardaremos el valor del segundo resultado
		double resultado2;

		double resultado3;
		// Declaramos la variable donde guardaremos el valor de la raíz
		double raiz;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le decimos al usuario cual es la ecuación a realizar
		System.out.println("La ecuación es la siguiente: ax^2 + bx + c = 0");

		// Le pedimos al usuario que nos diga un valor para a
		System.out.println("Escriba un valor para a: ");

		// Leemos el número
		a = sc.nextInt();

		// Le pedimos al usuario que nos diga un valor para b
		System.out.println("Escriba un valor para b: ");

		// Leemos el número
		b = sc.nextInt();

		// Le pedimos al usuario que nos diga un valor para c
		System.out.println("Escriba un valor para c: ");

		// Leemos el número
		c = sc.nextInt();

		// Operación para calcular la raíz
		raiz = (Math.pow(b, 2) - 4 * c * a);

		// Comprobamos si la ecuación tiene o no solución
		if (raiz >= 0) {
			if (a != 0) {
				resultado1 = (-b + Math.sqrt(raiz)) / (2 * a);
				resultado2 = (-b - Math.sqrt(raiz)) / (2 * a);
				System.out.println("Sus resultados son: " + resultado1 + " y " + resultado2);
			} else if (a == 0) {
				resultado3 = -c / b;
				System.out.println("Su resultado es igual: " + resultado3);

			} else {
				System.out.println("La ecuación no tiene solución.");
			}
		}

		// Cerramos el Scanner
		sc.close();
	}// Cierre de main

}// Cierre de clase