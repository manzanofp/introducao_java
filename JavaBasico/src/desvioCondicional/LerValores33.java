package desvioCondicional;

import java.util.Scanner;

public class LerValores33 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/* Ler dois valores e imprimir uma das três mensagens a seguir: 
‘Números iguais’, caso os números sejam iguais 
‘Primeiro é maior’, caso o primeiro seja maior que o segundo; 
‘Segundo maior’, caso o segundo seja maior que o primeiro */
		
		
		System.out.println("Digite um valor: ");
		double v1 = sc.nextDouble();
		
		System.out.println("Digite outro valor: ");
		double v2 = sc.nextDouble();
		
		if (v1 == v2) {
			
			System.out.println("Números iguais");
			
		} else if (v1 > v2 ) {
		
	System.out.println("Primeiro é maior");
			
		} else if (v2 > v1 ) {
			
			System.out.println("Segundo é maior");
			
		}
		
	}
}
