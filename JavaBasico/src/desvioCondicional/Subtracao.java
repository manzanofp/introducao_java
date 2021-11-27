package desvioCondicional;

import java.util.Scanner;

public class Subtracao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

// a subtração dos números
		
		int valor1;
		int valor2;
		int resultado;
	
		System.out.println("Insira um valor: ");
		valor1 = sc.nextInt();
		
		System.out.println("Insira outro valor: ");
		valor2 = sc.nextInt();
		
		resultado = valor1 - valor2;
		System.out.println("A Subtração dos valores é: " + resultado);
	
		sc.close();
	}
}
