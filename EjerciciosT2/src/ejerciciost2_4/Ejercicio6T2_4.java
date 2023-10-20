package ejerciciost2_4;

import java.util.Scanner;

public class Ejercicio6T2_4 {

	public static void main(String[] args) {
		String eleccion1, eleccion2, repetir;
		final String PIEDRA = "PIEDRA";
		final String TIJERAS = "TIJERAS";
		final String PAPEL = "PAPEL";
		final String REPETIR = "S";
		Scanner sc = new Scanner(System.in);

		do {

			do {
				System.out.println("Jugador 1 elija una opción correcta: (PIEDRA) (PAPEL) (TIJERAS)");
				eleccion1 = sc.nextLine();
			} while (!(eleccion1.equalsIgnoreCase(PIEDRA) || eleccion1.equalsIgnoreCase(PAPEL)
					|| eleccion1.equalsIgnoreCase(TIJERAS)));

			do {
				System.out.println("Jugador 2 elija una opción correcta: (PIEDRA) (PAPEL) (TIJERAS)");
				eleccion2 = sc.nextLine();
			} while (!(eleccion2.equalsIgnoreCase(PIEDRA) || eleccion2.equalsIgnoreCase(PAPEL)
					|| eleccion2.equalsIgnoreCase(TIJERAS)));

			if (eleccion1 == eleccion2) {
				System.out.println("EMPATE");
			} else if ((eleccion1 == PIEDRA && eleccion2 == TIJERAS) || (eleccion1 == TIJERAS && eleccion2 == PAPEL)
					|| (eleccion1 == PAPEL && eleccion2 == PIEDRA)) {
				System.out.println("Gana el jugador 1");

			} else {
				System.out.println("Gana el jugador 2");
			}

			System.out.println("¿Quieres volver a jugar?");
			repetir = sc.nextLine();
		} while (repetir.equalsIgnoreCase(REPETIR));
		
		sc.close();
	}

}
