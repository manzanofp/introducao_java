package desvioCondicional;

import java.util.Scanner;

public class OrdemCrescente30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/* Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem 
crescente. */

		System.out.println("Digite o 1 valor: ");
		double v1 = sc.nextDouble();
		
		System.out.println("Digite o 2 valor: ");
		double v2 = sc.nextDouble();
		
		System.out.println("Digite o 3 valor: ");
		double v3 = sc.nextDouble();
		
		if (v1 < v2 && v2 < v3 && v3 > v1) {
		
		System.out.println("A ordem crescente é: " + v1 + ", " + v2 + " e " + v3 + ".");
			
		} else if (v1 < v2 && v1 < v3 && v2 < v3) {
			
			System.out.println("A ordem crescente é: " + v1 + ", " + v3 + " e " + v2 + ".");
			
		} else if (v1 > v2 && v1 < v3 && v2 < v3) {
			
			System.out.println("A ordem crescente é: " + v2 + ", " + v1 + " e " + v3 + ".");
			
		} else if (v1 > v2 && v1 > v3 && v2 < v3) {
			
			System.out.println("A ordem crescente é: " + v2 + ", " + v3 + " e " + v1 + ".");
			
		} else if (v3 < v1 && v3 < v2 && v2 > v1) {
			
			System.out.println("A ordem crescente é: " + v3 + ", " + v1 + " e " + v2 + ".");
			
		} else if (v3 < v1 && v3 < v2 && v2 < v1) {
			
			System.out.println("A ordem crescente é: " + v3 + ", " + v2 + " e " + v1 + ".");
			
		}
		
	sc.close();	
	}
}
