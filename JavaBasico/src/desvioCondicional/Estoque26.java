package desvioCondicional;

import java.util.Scanner;

public class Estoque26 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		/* Fa�a um algoritmo para ler: quantidade atual em estoque, quantidade m�xima em estoque e 
quantidade m�nima em estoque de um produto. Calcular e escrever a quantidade m�dia ((quantidade 
m�dia = quantidade m�xima + quantidade m�nima)/2). Se a quantidade em estoque for maior ou igual 
a quantidade m�dia escrever a mensagem 'N�o efetuar compra', sen�o escrever a mensagem 'Efetuar 
compra'. */
	
		System.out.println("Digite a quantidade de estoque atual: ");
		int estoqueatual = sc.nextInt();
		
		System.out.println("Digite a quantidade m�nima do produto no estoque: ");
		int minestoque = sc.nextInt();
		
		System.out.println("Digite a quantidade m�xima do produto no estoque: ");
		int maxestoque = sc.nextInt();
		
		int media = (minestoque + maxestoque) / 2;
		
		if(estoqueatual >= media) {
			
		System.out.println("N�o efetuar a compra de mais produto!");
			
		} else {
			
		System.out.println("Efetuar a compra de mais produto!");
			
		}
		
		sc.close();
	}
}
