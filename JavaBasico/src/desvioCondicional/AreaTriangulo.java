package desvioCondicional;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Calcule a área do Retangulo

		float altura;
		float base;
		float area;

		System.out.println("Digite a altura: ");
		altura = sc.nextInt();

		System.out.println("Digite a base: ");
		base = sc.nextInt();

		area = (base * altura) / 2;
		System.out.println("A área do Triangulo é: " + area + "cm²");

		sc.close();
	}
}
