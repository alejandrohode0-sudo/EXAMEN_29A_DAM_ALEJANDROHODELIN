package PrimerPaquete;

import java.util.Scanner;

public class ClaseMain {
	public static void main(String[] args) {
		System.out.println("Buenos dias Ceinmark, soy Mart Gomez");
		int numero = new Scanner(System.in).nextInt();
		if (numero % 2 == 0) {
			System.out.println("Es un numero primo");
			System.out.println("Los divisores del numero son:");
			while (numero % 2 == 0) {
				System.out.println(numero);
				numero /= 2;
			}
			System.out.println(numero);
			System.out.println(numero / numero);
		}
		else {
			System.out.println("No es un numero primo");
		}
		
	}
}
