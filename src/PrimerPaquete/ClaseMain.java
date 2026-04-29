package PrimerPaquete;

import java.util.Scanner;

public class ClaseMain {
	public static void main(String[] args) {
		System.out.println("Buenos dias Ceinmark, soy Mart Gomez");
		int numero = new Scanner(System.in).nextInt();
		if (numero % 2 == 0) System.out.println("Es un numero primo");
		else System.out.println("No es un numero primo");
	}
}
