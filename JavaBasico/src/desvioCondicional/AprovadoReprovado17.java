package desvioCondicional;

import java.util.Scanner;

public class AprovadoReprovado17 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		/* Ler as notas da 1a. e 2a. avalia��es de um aluno. Calcular a m�dia aritm�tica simples e escrever 
uma mensagem que diga se o aluno foi ou n�o aprovado (considerar que nota igual ou maior que 6 o 
aluno � aprovado). Escrever tamb�m a m�dia calculada. */ 
		
		System.out.println("Digite a sua primeira nota: ");
		float n1 = sc.nextFloat();
		
		System.out.println("Digite a sua segunda nota: ");
		float n2 = sc.nextFloat();
		
		float media = (n1 + n2) / 2;
		
		if (media >=6 ) {
			
			System.out.println("APROVADO! sua m�dia foi: " + media);
			
		} else {
			
		System.out.println("REPROVADO! sua m�dia foi:  " + media);
			
		}
		sc.close();
	}
}
