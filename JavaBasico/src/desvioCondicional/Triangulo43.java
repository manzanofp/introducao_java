package desvioCondicional;

import java.util.Scanner;

public class Triangulo43 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Fa�a um teste de mesa e complete o quadro a seguir para os seguintes valores
		 * das vari�veis:
		 */

		System.out.println("Digite o valor de A: ");
		int a = sc.nextInt();

		System.out.println("Digite o valor de B: ");
		int b = sc.nextInt();

		System.out.println("Digite o valor de C: ");
		int c = sc.nextInt();

		var mens = "";

		if ((a < b + c) && (b < a + c) && (c < a + b)) {

			if ((a == b) && (b == c)) {

				mens = "Tri�ngulo Equil�tero!";

			} else if ((a == b) || (b == c) || (a == c)) {

				mens = "Tri�ngulo Is�sceles!";

			} else {

				mens = "Tri�ngulo Escaleno!";

			}
		} else {

			mens = "N�o forma um tri�ngulo!";

		}

		System.out.println("O tri�ngulo ser� do tipo: " + mens);

		sc.close();
	}

}
