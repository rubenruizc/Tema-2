package ejerciciost2_2;

import java.util.Scanner;

public class Ejercicio3T2_2 {

	public static void main(String[] args) {
		// Variable donde guardaremos el primer número del usuario
		double num1;
		
		// Variable donde guardaremos el segundo número del usuario
		double num2;
		
		// Variable donde guardaremos la operación de la suma
		double suma;
		
		// Variable donde guardaremos la operación de la resta
		double resta;
		
		// Variable donde guardaremos la operación de la multiplicación
		double multiplicacion;
		
		// Variable donde guardaremos la operación de la división
		double division;
		
		// Variable donde guardaremos la elección del usuario
		int elec;
		
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
		System.out.println("Elija que quiera hacer con esos dos número: (1:SUMAR) (2:RESTAR) (3:MULTIPLICAR) (4:DIVIDIR)");
		
		// Leemos el número
		elec = sc.nextInt();
		
		// Operación para hacer la suma
		suma = num1 + num2;
		
		// Operación para hacer la resta
		resta = num1 - num2;
		
		// Operación para hacer la multiplicación
		multiplicacion = num1 * num2;
		
		// Operación para hacer la división
		division = num1 / num2;
		
		// Comprobamos la elección del usuario
		switch (elec) {
		case 1 -> System.out.println("Sus números sumados son: " + suma);
		case 2 -> System.out.println("Sus números restados son: " + resta);
		case 3 -> System.out.println("Sus números multiplicados son: " + multiplicacion);
		case 4 -> System.out.println("Sus números divididos son: " + division);
		default -> System.out.println("ERROR");
		}

		// Cerramos el Scanner
		sc.close();
		
	}// Cierre main

}// Cierre clase
