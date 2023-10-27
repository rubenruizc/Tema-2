package ejerciciost2_4;

import java.util.Scanner;

public class Ejercicio7T2_4 {

	public static void main(String[] args) {

		// Variable donde guardaremos el primer número del usuario
		double num1;

		// Variable donde guardaremos el segundo número del usuario
		double num2;

		// Variable donde guardaremos el resultado que pida el usuario
		double resultado;

		// Variable donde guardaremos la letra que va a elegir el usuario
		String opcion;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario los números y comprobamos que su respuesta sea válida
		do {
			// Le pedimos al usuario un número
			System.out.println("Escriba un número: ");

			// Leemos el número del usuario
			num1 = sc.nextDouble();

			// Le pedimos al usuario otro número
			System.out.println("Escriba otro número: ");

			// Leemos el número del usuario
			num2 = sc.nextDouble();

			// Le preguntamos al usuario que quiere hacer con dichos números
			System.out.println("Indique que quiere hacer con esos números: (A:SUMAR) (B:RESTAR) (C:MULTIPLICAR) (D:DIVIDIR) (E:SALIR)");

			// Leemos la opción elegida por el usuario
			opcion = sc.next();

			// Mientras la opción del usuario no sea la indicada hará lo siguiente
			while (!opcion.equals("E") && !opcion.equals("A") && !opcion.equals("B") && !opcion.equals("C")
					&& !opcion.equals("D")) {

				// Le pedimos un valor válido al usuario 
				System.out.println("Indique un valor válido: (A:SUMAR) (B:RESTAR) (C:MULTIPLICAR) (D:DIVIDIR) (E:SALIR)");

				// Leemos de nuevo la opción
				opcion = sc.next();
			}

			// Realizamos diferentes operaciones dependiendo de la opción del usuario
			switch (opcion) {
			case "A" -> {
				resultado = num1 + num2;
				System.out.println("Sus números sumados son: " + resultado);
			}
			case "B" -> {
				resultado = num1 - num2;
				System.out.println("Sus números restados son: " + resultado);
			}
			case "C" -> {
				resultado = num1 * num2;
				System.out.println("Sus números multiplicados son: " + resultado);
			}
			case "D" -> {
				resultado = num1 / num2;
				System.out.println("Sus números divididos son: " + resultado);
			}
			case "E" -> System.out.println("SALIENDO...");

			}

		} while (!opcion.equals("E"));

		// Cerramos el Scanner
		sc.close();

	}// Cierre del main

} // Cierre de la clase
