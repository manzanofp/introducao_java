package desvioCondicional;

import java.util.Scanner;

public class Antecessor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// O n�mero antecessor �
		
		int valor1;
		int ant;
		
		System.out.println("Digite um valor: ");
		valor1 = sc.nextInt();
		
		ant = valor1 - 1;
		System.out.println("O n�mero antecessor �: " + ant);

		sc.close();

	}
}
