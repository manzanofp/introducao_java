package desvioCondicional;

import java.util.Scanner;

public class PodeVotar18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/* Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela 
poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu). */
		
System.out.println("Digite o seu ano de nascimento: ");
int anonasc = sc.nextInt();

int anoatual = 2021;

 int votar = anoatual - anonasc;

if(votar >= 16) {

System.out.println("Você pode votar !!!");	
	
} else {
	
	System.out.println("Você não pode votar !!!");
	
}
		sc.close();
	}	
}
