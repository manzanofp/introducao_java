package desvioCondicional;

import java.util.Scanner;

public class SomaMaiores29 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		/* Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 
maiores.*/
		
		System.out.println("Digite o 1 valor: ");
		double v1 = sc.nextDouble();
		
		System.out.println("Digite o 2 valor: ");
		double v2 = sc.nextDouble();
		
		System.out.println("Digite o 3 valor: ");
		double v3 = sc.nextDouble();
		
		if (v1 < v2 && v1 < v3) {
			
			double soma = v2 + v3;
			System.out.println("Os maiores números digitados foram: " + v2 + "e" + v3 + ". A soma deles é: " + soma + ".");
			
		} else if (v2 < v1 && v2 < v3 ) {
			
			double soma = v1 + v3;
			System.out.println("Os maiores números digitados foram: " + v1 + "e" + v3 + ". A soma deles é: " + soma + ".");
			
		} else if (v3 < v1 && v3 < v2) {
			
			double soma = v2 + v1;
			System.out.println("Os maiores números digitados foram: " + v2 + "e" + v1 + ". A soma deles é: " + soma + ".");
			
		}
		sc.close();
	}
}
