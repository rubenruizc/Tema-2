package ejerciciost2_2;

import java.util.Scanner;

public class Ejercicio2T2_2 {

	public static void main(String[] args) {

		// Variable donde guardaremos el número del usuario
		int num;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le explicamos al usuario en que consiste el ejercicio
		System.out.println("El ejercicio consiste en decirte que día de la semana elegiste");
		
		// Le pedimos al usuario un número comprendido entre el 1 y el 7
		System.out.print("Escriba un número comprendido entre el 1 y el 7: ");
		
		// Leemos el número
		num = sc.nextInt();
		
		// Comprobamos a que día de la semana corresponde el número del ususario
		switch (num) {
		case 1 -> System.out.println("SU NÚMERO CORRESPONDE AL LUNES");
		case 2 -> System.out.println("SU NÚMERO CORRESPONDE AL MARTES");
		case 3 -> System.out.println("SU NÚMERO CORRESPONDE AL MIÉRCOLES");
		case 4 -> System.out.println("SU NÚMERO CORRESPONDE AL JUEVES");
		case 5 -> System.out.println("SU NÚMERO CORRESPONDE AL VIERNES");
		case 6 -> System.out.println("SU NÚMERO CORRESPONDE AL SÁBADO");
		case 7 -> System.out.println("SU NÚMERO CORRESPONDE AL DOMINGO");
		default -> System.out.println("SU NÚMERO NO CORRESPONDE A NINGÚN DÍA");
		}

		// Cerramos el Scanner
		sc.close();
		
	}// Cierre del main

}// Cierre de la clase
