package desvioCondicional;

import java.util.Scanner;

public class ConsultarSaldo25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/* Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e 
escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior 
ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.  */ 
		
		System.out.println("Digite o número da sua conta: ");
		float numconta = sc.nextFloat();
		
		System.out.println("Digite o saldo da sua conta bancária: ");
		double saldo = sc.nextDouble();
		
		System.out.println("Digite os débitos da sua conta bancária: ");
		double debito = sc.nextDouble();
		
		System.out.println("Digite o crédito da sua conta bancária: ");
		double credito = sc.nextDouble();
		
		double saldoatual = (saldo - debito)+ credito;
		
		if (saldoatual >= 0 ) {
			
			System.out.println("Seu saldo atual é de: R$ " + saldoatual + " Seu saldo é POSITIVO!!");
			
		} else {
			
			System.out.println("Seu saldo atual é de: R$ " + saldoatual + " Seu saldo é NEGATIVO!!");
			
		}
	
		
		sc.close();
	}
}
