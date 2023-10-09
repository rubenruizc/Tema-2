package ejerciciost2_2;

import java.util.Scanner;

public class Ejercicio4T2_2 {

	public static void main(String[] args) {
		String tirada1, tirada2;
		int valorTirada1 = 0, valorTirada2 = 0;
		int valorTotal;
		Scanner sc = new Scanner (System.in);
		System.out.println("¿Cuánto ha sacado en la primera tirada?");
		tirada1 = sc.nextLine();
		System.out.println("¿Cuánto ha sacado en la seguunda tirada?");
		tirada2 = sc.nextLine();
		switch (tirada1) {
		case "UNO" -> valorTirada1 = 1;
		case "DOS" -> valorTirada1 = 2;
		case "TRES" -> valorTirada1 = 3;
		case "CUATRO" -> valorTirada1 = 4;
		case "CINCO" -> valorTirada1 = 5;
		case "SEIS" -> valorTirada1 = 6;
		default ->
		System.out.println("NÚMERO MAL INTRODUCIDO");
		}
		switch (tirada2) {
		case "UNO" -> valorTirada2 = 1;
		case "DOS" -> valorTirada2 = 2;
		case "TRES" -> valorTirada2 = 3;
		case "CUATRO" -> valorTirada2 = 4;
		case "CINCO" -> valorTirada2 = 5;
		case "SEIS" -> valorTirada2 = 6 ;
		default ->
		System.out.println("NÚMERO MAL INTRODUCIDO");
		}
		
		valorTotal = valorTirada1 + valorTirada2;
		System.out.println("Su tirada da un total de: " + valorTotal);
		
		sc.close();
	}

}
