package ejerciciost2;

import java.util.Scanner;

public class Ejercicio8T2 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos el número del usuario
		float num;

		// Scanner para poder leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos a el usuario una nota/número
		System.out.println("Escriba una nota: ");

		// Leemos el número
		num = sc.nextFloat();

		// Comprobamos que nota consigue el usuario dependiendo de el número insertado
		if (num >= 0 && num < 5) {
			System.out.println("INSUFICIENTE");
		} else if (num >= 5 && num < 6) {
			System.out.println("SUFICIENTE");
		} else if (num >= 6 && num < 7) {
			System.out.println("BIEN");
		} else if (num >= 7 && num < 9) {
			System.out.println("NOTABLE");
		} else if (num >= 9 && num <= 10) {
			System.out.println("SOBRESALIENTE");
		} else {
			System.out.println("Su nota no se puede registrar.");
		}
		
		// Cerramos el Scanner
		sc.close();
		
	}// Cierre main
	
}// Cierre clase
