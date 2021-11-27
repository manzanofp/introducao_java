package desvioCondicional;

import java.util.Scanner;

public class Estoque26 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		/* Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e 
quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade 
média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual 
a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar 
compra'. */
	
		System.out.println("Digite a quantidade de estoque atual: ");
		int estoqueatual = sc.nextInt();
		
		System.out.println("Digite a quantidade mínima do produto no estoque: ");
		int minestoque = sc.nextInt();
		
		System.out.println("Digite a quantidade máxima do produto no estoque: ");
		int maxestoque = sc.nextInt();
		
		int media = (minestoque + maxestoque) / 2;
		
		if(estoqueatual >= media) {
			
		System.out.println("Não efetuar a compra de mais produto!");
			
		} else {
			
		System.out.println("Efetuar a compra de mais produto!");
			
		}
		
		sc.close();
	}
}
