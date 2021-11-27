package desvioCondicional;

import java.util.Scanner;

public class MaiorEmenor14 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		/*  Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso 
contrário escrever NÃO É MAIOR QUE 10! */
		
		System.out.println("Digite um valor: ");
		float valor = sc.nextFloat();
		
		if(valor >= 10) {
			
			System.out.println("O VALOR É MAIOR QUE 10 !!!");			
			
		} else {
			
			System.out.println("O VALOR É MENOR QUE 10 !!!");
			
		}
		
		sc.close();
	}
}