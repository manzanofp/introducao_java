package desvioCondicional;

import java.util.Scanner;

public class AprovadoReprovado17 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		/* Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever 
uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o 
aluno é aprovado). Escrever também a média calculada. */ 
		
		System.out.println("Digite a sua primeira nota: ");
		float n1 = sc.nextFloat();
		
		System.out.println("Digite a sua segunda nota: ");
		float n2 = sc.nextFloat();
		
		float media = (n1 + n2) / 2;
		
		if (media >=6 ) {
			
			System.out.println("APROVADO! sua média foi: " + media);
			
		} else {
			
		System.out.println("REPROVADO! sua média foi:  " + media);
			
		}
		sc.close();
	}
}
