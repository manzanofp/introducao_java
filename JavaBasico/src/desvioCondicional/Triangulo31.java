package desvioCondicional;

import java.util.Scanner;

public class Triangulo31 {

public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	/* Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam 
ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma 
dos outros 2 lados. */
	
	System.out.println("Digite o valor do primeiro lado: ");
	int a = sc.nextInt();
	
	System.out.println("Digite o valor do segundo lado: ");
	int b = sc.nextInt();
	
	System.out.println("Digite o valor do terceiro lado: ");
	int c = sc.nextInt();
	
	if(a < b + c && b < a + c && c < b + a) {
		
		System.out.println(" É UM TRIÂNGULO!");
		
	} else {
		
		System.out.println(" NÃO É UM TRIÂNGULO!");
		
	}
	sc.close();
}	
}
