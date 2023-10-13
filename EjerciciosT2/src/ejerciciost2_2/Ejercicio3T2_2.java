package ejerciciost2_2;

import java.util.Scanner;

public class Ejercicio3T2_2 {

	public static void main(String[] args) {
		// Variable donde guardaremos el primer número del usuario
		double num1;

		// Variable donde guardaremos el segundo número del usuario
		double num2;

		// Variable donde guardaremos las operaciones
		double resultado;

		// Variable donde guardaremos la elección del usuario
		String elec;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario un número
		System.out.print("Escriba un número: ");

		// Leemos el número
		num1 = sc.nextDouble();

		// Le pedimos al usuario otro número
		System.out.print("Escriba otro número:");

		// Leemos el número
		num2 = sc.nextDouble();

		// Le pedimos al usuario que nos diga que le gustaría hacer con esos dos números
		System.out.println(
				"Elija que quiera hacer con esos dos número: (A:SUMAR) (B:RESTAR) (C:MULTIPLICAR) (D:DIVIDIR)");

		// Leemos el número
		elec = sc.next();

		// Comprobamos la elección del usuario
		switch (elec) {
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
			if (num2 != 0) {
				resultado = num1 / num2;
				System.out.println("Sus números divididos son: " + resultado);
			} else {
				System.out.println("ERROR (No se puede dividir entre 0)");
			}

		}
		default -> System.out.println("ERROR");
		}

		// Cerramos el Scanner
		sc.close();

	}// Cierre main

}// Cierre clase
