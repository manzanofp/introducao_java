package desvioCondicional;

import java.util.Scanner;

public class ValorMaior19 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		/*  Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. */
		
		
		System.out.println("Digite o primeiro valor: ");
		double valor1 = sc.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double valor2 = sc.nextDouble();
		
		if (valor1 > valor2 ) {
			
			System.out.println("o " + valor1 + " é maior que " + valor2 );
			
		} else if (valor1 == valor2) {
			
			System.out.println("os valores são iguais");
			
		} else {
			
			System.out.println("o " + valor2 + " é maior que " + valor1 );
			
		}
		
		
		sc.close();
	}
}
