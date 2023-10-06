package ejerciciost2;

import java.util.Scanner;

public class Ejercicio9T2 {

	public static void main(String[] args) {

		// Variable donde guardaremos la elección del primer jugador
		int ele1;

		// Variable donde guardaremos la elección del primer jugador
		int ele2;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Explicamos en que consiste el ejercicio
		System.out.println("Indique su selección: (1 = piedra, 2 = tijeras, 3 = papel");

		// Pedimos al usuario que el jugador 1 elija
		System.out.print("Elija jugador 1:");

		// Leemos el número
		ele1 = sc.nextInt();

		// Pedimos al usuario que el jugador 2 elija
		System.out.print("Elija jugador 2:");

		// Leemos el número
		ele2 = sc.nextInt();

		// Comprobamos quien de los dos jugadores han ganado
		// Opciones para que el jugador 1 gane
		if ((ele1 == 1 && ele2 == 2) || (ele1 == 2 && ele2 == 3) || (ele1 == 3 && ele2 == 1)) {
			System.out.println("Gana el jugador 1.");
			// Opciones para que el jugador 2 gane
		} else if ((ele1 == 2 && ele2 == 1) || (ele1 == 2 && ele2 == 3) || (ele1 == 1 && ele2 == 3)) {
			System.out.println("Gana el jugador 2.");
			// Opción para que la partida no valga
		} else {
			System.out.println("Partida no válida.");
		}

		// Cerramos el Scanner
		sc.close();

	}// Cierre de main

}// Cierre de clase
