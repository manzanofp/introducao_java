package desvioCondicional;

import java.util.Scanner;

public class ConsultarSaldo25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/* Fa�a um algoritmo para ler: n�mero da conta do cliente, saldo, d�bito e cr�dito. Ap�s, calcular e 
escrever o saldo atual (saldo atual = saldo - d�bito + cr�dito). Tamb�m testar se saldo atual for maior 
ou igual a zero escrever a mensagem 'Saldo Positivo', sen�o escrever a mensagem 'Saldo Negativo'.  */ 
		
		System.out.println("Digite o n�mero da sua conta: ");
		float numconta = sc.nextFloat();
		
		System.out.println("Digite o saldo da sua conta banc�ria: ");
		double saldo = sc.nextDouble();
		
		System.out.println("Digite os d�bitos da sua conta banc�ria: ");
		double debito = sc.nextDouble();
		
		System.out.println("Digite o cr�dito da sua conta banc�ria: ");
		double credito = sc.nextDouble();
		
		double saldoatual = (saldo - debito)+ credito;
		
		if (saldoatual >= 0 ) {
			
			System.out.println("Seu saldo atual � de: R$ " + saldoatual + " Seu saldo � POSITIVO!!");
			
		} else {
			
			System.out.println("Seu saldo atual � de: R$ " + saldoatual + " Seu saldo � NEGATIVO!!");
			
		}
	
		
		sc.close();
	}
}
