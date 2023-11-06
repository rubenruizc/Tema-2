package ejerciciost2_5;

import java.util.Scanner;

public class Ejercicio8T2_5 {

	public static void main(String[] args) {
		int nota;
		int contadorSuspensos=0;
		Scanner sc = new Scanner (System.in);
		
		for (int i=1; i<=5;i++) {
			System.out.print("Escriba una nota: ");
			nota = sc.nextInt();
			if (nota <=4) {
				contadorSuspensos++;
			}
		}
		System.out.println("Hay un total de: " + contadorSuspensos + " suspensos");
		sc.close();
	}

}
