package desvioCondicional;

import java.util.Scanner;

public class PodeVotar18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/* Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela 
poder� ou n�o votar este ano (n�o � necess�rio considerar o m�s em que a pessoa nasceu). */
		
System.out.println("Digite o seu ano de nascimento: ");
int anonasc = sc.nextInt();

int anoatual = 2021;

 int votar = anoatual - anonasc;

if(votar >= 16) {

System.out.println("Voc� pode votar !!!");	
	
} else {
	
	System.out.println("Voc� n�o pode votar !!!");
	
}
		sc.close();
	}	
}
