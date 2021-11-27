package desvioCondicional;

import java.util.Scanner;

public class OrdemCrescente20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/*  Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. */
		
		System.out.println("Digite um valor: ");
		float valor1 = sc.nextFloat();
		
		System.out.println("Digite um outro valor: ");
		float valor2 = sc.nextFloat();
		
		if (valor1 > valor2) {
	
			System.out.println("A ordem crescente é: " + valor2 + "," + valor1 );
			
	} else {
		
		System.out.println("A ordem crescente é: " + valor1 + "," + valor2);
		
	}
		sc.close();
}
}
