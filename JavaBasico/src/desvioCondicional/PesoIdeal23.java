package desvioCondicional;

import java.util.Scanner;

public class PesoIdeal23 {

public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	/* Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule 
e mostre seu peso ideal, utilizando as seguintes fórmulas: */ 
	

	
	System.out.println("Digite o seu nome: ");
	 var nome = sc.next();
	
	System.out.println("Digite a sua altura: ");
	double altura = sc.nextDouble();
	
	System.out.println("Digite o seu sexo: [M] ou [F]" );
	var sexo = sc.next();
	
	if(sexo.equals("M")) {
		
	double pesoideal = (72.7 * altura) - 58;
		System.out.println("O seu peso ideal sendo do sexo masculino é: " + pesoideal);
		
	} else if (sexo.equals("F")) {
		
	double pesoideal = (62.1 * altura) - 44.7;
	System.out.println("O seu peso ideal sendo do sexo feminino é: " + pesoideal);
		
	}
	
	sc.close();
}	
}
