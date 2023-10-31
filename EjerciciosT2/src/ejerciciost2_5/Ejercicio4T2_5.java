package ejerciciost2_5;

import java.util.Scanner;

public class Ejercicio4T2_5 {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner (System.in);
		System.out.println("Los múltiplos de 3 desde el 1 hasta un número que introducimos por teclado");
		System.out.println("Escriba un número entero:");
		numero= sc.nextInt();
		for (int i = 1; i <= numero;i++) {
			if (i%3 == 0)
				System.out.println(i);
		}
		sc.close();
	}

}
