package desvioCondicional;

import java.util.Scanner;

public class CompraProduto40 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/* Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço 
unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total 
a pagar (total a pagar = total - desconto), sabendo-se que: */
		
		System.out.println("Qual o produto a ser adquirido? ");
		var produto = sc.next();
		
		System.out.println("Digite a quantidade a ser adquirida: ");
		int quantidade = sc.nextInt();
		
		System.out.println("Digite o preço unitário do produto: ");
		int precounit = sc.nextInt();
		int desconto = 0;
		
		int total = quantidade * precounit;
		
		if(quantidade <= 5) {
			
			 desconto = total * 2 / 100;
			
		} else if (quantidade > 10) {
			
			 desconto = total * 5 / 100;
			
		}
		
		int valor = total - desconto;
		System.out.println("O valor a ser pago comprando " + quantidade + " unidades de " + produto + " sem os descontos fica: R$ " + total + ". Com os descontos aplicados o preço fica: R$ " + valor);
		
		sc.close();
	}
}
