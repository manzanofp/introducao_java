package desvioCondicional;

import java.util.Scanner;

public class Divisao {
	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

// a Divis�o dos n�meros

float valor1;
float valor2;
float resultado;


System.out.println("Insira um valor: ");
valor1 = sc.nextInt();
System.out.println("Insira outro valor: ");
valor2 = sc.nextInt();

resultado = valor1 / valor2;		
System.out.println("A divis�o dos valores �: " + resultado);
		sc.close();
	}
}
