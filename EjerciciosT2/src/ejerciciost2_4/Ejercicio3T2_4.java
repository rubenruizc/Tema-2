package ejerciciost2_4;

import java.util.Scanner;

public class Ejercicio3T2_4 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos el número del usuario
		int numUsuario;
		
		// Variable donde guardaremos los números anteriores al número del usuario
		int contador = 1;
		
		// Variable donde guardaremos la suma del número del usuario con sus anteriores
		int suma = 0;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que introduzca un número hasta que introduzca uno
		// correcto
		do {

			System.out.println("Introduzca un número (mayor que 0) y le sumaremos sus anteriores");
			numUsuario = sc.nextInt();
			
		} while (numUsuario < 1);
		
		// Vamos sumando números al contador hasta que este sea mayor que el número del
		// usaurio
		do {
			suma += contador;
			contador++;

		} while (numUsuario >= contador);
		
		// Le decimos al usuario cual sería la suma de su número con los anteriores al
		// mismo
		System.out.println("La suma de sus números entre 1 y " + numUsuario + " es " + suma);
		
		// Cerramos el Scanner
		sc.close();
		
	} // Cierre de main
	
} // Cierre de clase
