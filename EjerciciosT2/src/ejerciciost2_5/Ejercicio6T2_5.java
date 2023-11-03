package ejerciciost2_5;

public class Ejercicio6T2_5 {

	public static void main(String[] args) {
		int suma=0;
		for (int i=0;i<=19;i++) {
			if (i%2!=0) {
				suma+=i;
				
			}
		}
		System.out.println("La suma de los 10 primeros números impares es: " + suma);
	}

}
