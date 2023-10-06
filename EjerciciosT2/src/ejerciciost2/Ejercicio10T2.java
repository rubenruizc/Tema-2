package ejerciciost2;

import java.util.Scanner;

public class Ejercicio10T2 {

	public static void main(String[] args) {
		//Declaramos la variable donde guardaremos el primer número
				int num1;
				//Declaramos la variable donde guardaremos el segundo número
				int num2;
				//Declaramos la variable donde guardaremos el tercer número
				int num3;
				//Scanner para leer del teclado
				Scanner sc = new Scanner (System.in);
				//Le pedimos al usuario un número
				System.out.print("Escriba un número: ");
				//Leemos el número
				num1 = sc.nextInt();
				//Le pedimos al usuario otro número
				System.out.print("Escriba otro número: ");
				//Leemos el número
				num2 = sc.nextInt();
				//Le pedimos al usuario otro número
				System.out.print("Escriba otro número: ");
				//Leemos el número
				num3 = sc.nextInt();
				//Comprobamos si la suma de alguno de los tres números da el otro
				if (num1 + num2 == num3) {
					System.out.print("Si sumas " + num1 + " + " + num2 + " se obtiene " + num3);
				}else if(num1 + num3 == num2) {
					System.out.print("Si sumas " + num1 + " + " + num3 + " se obtiene " + num2);
				}else if (num2 + num3 == num1){
					System.out.print("Si sumas " + num2+" + " + num3 + " se obtiene " + num1);
				}else {
					System.out.print("La suma de sus números no da como resultado otro número");
				}
				
				//Cerramos el Scanner
				sc.close();
				
			}//Cierre del main
			
		}//Cierre clase