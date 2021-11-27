package desvioCondicional;

import java.util.Scanner;

public class PositivoNegativo15 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		/* Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).  */
		
		System.out.println("Digite um valor: ");
		float valor =  sc.nextFloat();
		
		if (valor < 0 ) {
			
			System.out.println("O VALOR É NEGATIVO !!!");
		
		} else if (valor >= 0 ){
			
			System.out.println("O VALOR  É POSITIVO !!!");
			
		}
		sc.close();
	}
}
