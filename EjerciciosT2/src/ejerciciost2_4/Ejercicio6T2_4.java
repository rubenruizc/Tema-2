package ejerciciost2_4;

import java.util.Scanner;

public class Ejercicio6T2_4 {

	public static void main(String[] args) {

		// Constante donde guardaremos la opción piedra
		final String PIEDRA = "PIEDRA";

		// Constante donde guardaremos la opción tijeras
		final String TIJERAS = "TIJERAS";

		// Constante donde guardaremos la opción papel
		final String PAPEL = "PAPEL";

		// Constante donde guardaremos la opción para poder repetir la partida
		final String REPETIR = "SI";

		// Variable donde guardaremos la elección del jugadoer 1
		String eleccion1;

		// Variable donde guardaremos la elección del jugador 2
		String eleccion2;

		// Variable donde guardaremos la opción de repetir la partida
		String repetir;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Ejecutamos todo mientras el usuario quiera y le apetezca
		do {
			
			// Le pedimos al jugador 1 su opción hasta que esta sea correcta
			do {
				System.out.println("Jugador 1 elija una opción correcta: (PIEDRA) (PAPEL) (TIJERAS)");
				eleccion1 = sc.nextLine();
				
			} while (!(eleccion1.equalsIgnoreCase(PIEDRA) || eleccion1.equalsIgnoreCase(PAPEL)
					|| eleccion1.equalsIgnoreCase(TIJERAS)));
			
			// Le pedimos al jugador 2 su opción hasta que esta sea correcta
			do {
				System.out.println("Jugador 2 elija una opción correcta: (PIEDRA) (PAPEL) (TIJERAS)");
				eleccion2 = sc.nextLine();
				
			} while (!(eleccion2.equalsIgnoreCase(PIEDRA) || eleccion2.equalsIgnoreCase(PAPEL)
					|| eleccion2.equalsIgnoreCase(TIJERAS)));

			// Condición para que la partida acabe empate
			if (eleccion1 == eleccion2) {
				System.out.println("EMPATE");
				
				// Condición para que la partida la gane el jugador 1
			} else if ((eleccion1.equalsIgnoreCase(PIEDRA) && eleccion2.equalsIgnoreCase(TIJERAS))
					|| (eleccion1.equalsIgnoreCase(TIJERAS) && eleccion2.equalsIgnoreCase(PAPEL))
					|| (eleccion1.equalsIgnoreCase(PAPEL) && eleccion2.equalsIgnoreCase(PIEDRA))) {
				System.out.println("Gana el jugador 1");
				
				// Condición para que la partida la gana el jugador 2
			} else {
				System.out.println("Gana el jugador 2");
			}
			
			// Le preguntamos al usuario si quiere seguir jugando
			System.out.println("¿Quieres volver a jugar?");
			
			// Leemos su respuesta
			repetir = sc.nextLine();
			
		} while (repetir.equalsIgnoreCase(REPETIR));

		// Cerramos el Scanner
		sc.close();

	}// Cierre de main

} // Cierre de clase
