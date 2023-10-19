package ejerciciost2_4;

import java.util.Scanner;

public class Ejercicio4T2_4 {

	public static void main(String[] args) {

		// Variable donde guardaremos el número del usuario
		int numUsuario;

		// Variable donde guardaremos los del 1 al 10
		int contador = 0;

		// Variable donde guardaremos la operación de multiplicación
		int multiplicacion = 0;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número hasta que introduzca uno
		// correcto
		do {
			System.out.println("Introduzca un número (mayor que 0)");
			numUsuario = sc.nextInt();

		} while (numUsuario < 1);

		// Vamos multiplicando el número del usuario con el contador hasta que este sea
		// mayor que 10
		do {
			multiplicacion = numUsuario * contador;
			System.out.println(numUsuario + " x " + contador + " = " + multiplicacion);
			contador++;

		} while (contador <= 10);

		// Cerramos el Scanner
		sc.close();

	}// Cierre del main

} // Cierre de la clase
