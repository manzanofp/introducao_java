package desvioCondicional;

import java.util.Scanner;

public class PositivoNegativo27 {

public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	
	/*  Ler um valor e escrever se é positivo, negativo ou zero. */ 
	
	System.out.println("Digite um valor: ");
	double valor = sc.nextDouble();
	
	if (valor <0) {
		
		System.out.println("O VALOR É NEGATIVO!");
			
	} else if (valor == 0) {
		
	System.out.println("O VALOR É ZERO!");
		
	} else {
		
		System.out.println("O VALOR É POSITIVO!");
		
	}
	sc.close();
}	
}
