package ejerciciost2_4;

import java.util.Scanner;

public class Ejercicio7T2_4 {

	public static void main(String[] args) {
		double num1, num2;
		double resultado;
		String opcion;
		
		Scanner sc = new Scanner (System.in);
		
		do {
			
			System.out.println("Escriba un número: ");
			num1 = sc.nextDouble();
			System.out.println("Escriba otro número: ");
			num2 = sc.nextDouble();
			System.out.println("Indique que quiere hacer con esos números: (A:SUMAR) (B:RESTAR) (C:MULTIPLICAR) (D:DIVIDIR) (E:SALIR)");
			opcion = sc.next();
			
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
				resultado = num1 / num2 ;
				System.out.println("Sus números divididos son: " + resultado);
			}
			case "E" -> 
			System.out.println("SALIENDO...");
			}
				
				
		}while (!opcion.equalsIgnoreCase("E"));
		
		sc.close();
	}

}
