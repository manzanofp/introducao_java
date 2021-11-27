package desvioCondicional;

import java.util.Scanner;


public class ConversorTemperatura12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/*  Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor 
	correspondente em graus Celsius */ 
		
		System.out.println("Digite a temperatura em graus Fahrenheit: ");
		float grausf = sc.nextFloat();
		
		float grausc = (grausf - 32) * 5 / 9;
		
		System.out.println("a temperatura em graus celsius é: " + grausc);
	
		sc.close();
	}
}
