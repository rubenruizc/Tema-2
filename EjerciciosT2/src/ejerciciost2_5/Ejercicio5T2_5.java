package ejerciciost2_5;

import java.util.Scanner;

public class Ejercicio5T2_5 {

	public static void main(String[] args) {
		
		int numero;
		float media;
		int suma=0;
		Scanner sc = new Scanner (System.in);
		for (int i = 0;i<10;i++) {
			System.out.println("Escriba un número");
			numero = sc.nextInt();
			suma+=numero;
		}
		media = (float) suma/10;
		System.out.println("Su media es:" + media );
		sc.close();
	}
	
}
