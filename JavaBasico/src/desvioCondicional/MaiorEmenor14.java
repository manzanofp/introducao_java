package desvioCondicional;

import java.util.Scanner;

public class MaiorEmenor14 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		/*  Ler um valor e escrever a mensagem � MAIOR QUE 10! se o valor lido for maior que 10, caso 
contr�rio escrever N�O � MAIOR QUE 10! */
		
		System.out.println("Digite um valor: ");
		float valor = sc.nextFloat();
		
		if(valor >= 10) {
			
			System.out.println("O VALOR � MAIOR QUE 10 !!!");			
			
		} else {
			
			System.out.println("O VALOR � MENOR QUE 10 !!!");
			
		}
		
		sc.close();
	}
}