package desvioCondicional;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Fa�a um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
		//dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e m�s com 30 dias.
		
		System.out.println("Digite a sua idade em anos: ");
		int anos = sc.nextInt();
		
		System.out.println("Digite a sua idade em meses: ");
		int meses = sc.nextInt();
		
		System.out.println("Digite a sua idade em dias: ");
		int dias = sc.nextInt();
		
	
		int total = anos * 365 + meses * 30 + dias;
		
		System.out.print("A quantidade de dias vividos �: " + total);
		
		
		
		
		sc.close();
	}
}
