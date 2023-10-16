package ejerciciost2_3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7T2_3 {

	public static void main(String[] args) {

		// Variable donde guardaremmos el número del usuario
		int numUsuario = 0;
		
		// Variable donde guardaremos el número random
		int numr;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Generamos un número random entre el 1 y el 100
		Random r = new Random();
		
		// Número random
		numr = r.nextInt(1, 101); // [1,101)
		
		// Le explicamos al usuario en que consiste el ejercicio
		System.out.println("El ejercicio consiste en intentar adivinar el número comprendido entre 1 y 100");
		
		// Comprobamos que el número sea distinto a 1 y distinto al número random
		while (numUsuario != -1 && numUsuario != numr) {
			
			// Le pedimos al usuario un número
			System.out.println("Escriba un número:");
			
			// Leemos el número
			numUsuario = sc.nextInt();
			
			// Si el número del usuario es menor que el random le decimos que su número es menor
			if (numUsuario < numr && numUsuario != -1) {
				System.out.println("MENOR");
				
			}
			
			// Si el número del usario es mayor que el random le decimos que su número es mayor
			if (numUsuario > numr && numUsuario != -1) {
				System.out.println("MAYOR");
			}

		}
		
		// Si el número del ususario es igual a -1 ha perdido
		if (numUsuario == -1) {
			System.out.println("PERDISTE");
		}
		
		// Si el número del ususario es igual al número random ha ganado
		if (numUsuario == numr) {
			System.out.println("LO ADIVINASTE");
		}
		
		// Cerramos el Scanner
		sc.close();
		
	} // Cierre de main

} // Cierre de clase
