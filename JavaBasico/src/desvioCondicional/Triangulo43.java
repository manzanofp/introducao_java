package desvioCondicional;

import java.util.Scanner;

public class Triangulo43 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Faça um teste de mesa e complete o quadro a seguir para os seguintes valores
		 * das variáveis:
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

				mens = "Triângulo Equilátero!";

			} else if ((a == b) || (b == c) || (a == c)) {

				mens = "Triângulo Isósceles!";

			} else {

				mens = "Triângulo Escaleno!";

			}
		} else {

			mens = "Não forma um triângulo!";

		}

		System.out.println("O triângulo será do tipo: " + mens);

		sc.close();
	}

}
