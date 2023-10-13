package ejerciciost2_3;

import java.util.Scanner;

public class Ejercicio6T2_3 {

	public static void main(String[] args) {
		int edad=0;
		int numAlumno=0;
		int sumaEdad=0;
		int mayorEdad=0;
		Scanner sc = new Scanner (System.in);
		
		while (edad >=0) {
			System.out.println("Escriba una edad");
			edad = sc.nextInt();
			sumaEdad += edad;
			numAlumno++;
			if (edad >=18) {
				mayorEdad++;
			} else {
			
		}
		

	}
		System.out.println("Todas las edades sumadas son:" + sumaEdad);
		System.out.println("Hay una cantidad de: " + numAlumno + " alumnos" );
		System.out.println("Hay una cantidad de " + mayorEdad + " mayores de edad");

		sc.close();
}
}
