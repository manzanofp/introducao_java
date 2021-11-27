package desvioCondicional;

import java.util.Scanner;

public class PostoGasolina35 {

public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	/* Escreva um algoritmo que leia o n�mero de litros vendidos e o tipo de combust�vel (codificado da 
seguinte forma: A-�lcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se 
que o pre�o do litro da gasolina � R$ 3,30 e o pre�o do litro do �lcool � R$ 2,90. */
	
	System.out.println("Escolha o tipo de combustivel que deseja: [A] - �lcool ou [G] - Gasolina ?");
	var combustivel = sc.next();
	
	System.out.println("Digite a quantidade de litros que deseja abastecer: ");
	int litros = sc.nextInt();
	
	if (combustivel == "A" && litros <= 20) {
		
		double precoA = litros * 2.90;
		double desconto = precoA * 3 / 100;
		double valorfinal = precoA - desconto;
		
		System.out.println("O valor a ser pago SEM o desconto seria de: R$" + precoA + ". O valor COM o desconto ser� de: R$" + valorfinal);
		
	} else if (combustivel == "A" && litros > 20) {
		
		  double precoA = litros * 2.90;
		double desconto = precoA * 5 / 100;
		double valorfinal = precoA - desconto;
		
		System.out.println("O valor a ser pago SEM o desconto seria de: R$" + precoA + ". O valor COM o desconto ser�: R$" + valorfinal);
		
	} else if (combustivel == "G" && litros <= 20) {
		
		double precoG = litros * 3.30;
		double desconto = precoG * 4 / 100;
		double valorfinal = precoG - desconto;
		
		System.out.println("O valor a ser pago SEM o desconto seria de: R$" + precoG + ". o valor COM o desconto ser� de: R$" + valorfinal);
		
	} else if (combustivel == "G" && litros > 20) {
		
	double precoG = litros * 3.30;
	double desconto = precoG * 6 / 100;
	double valorfinal = precoG - desconto;
	
	System.out.println("O valor a ser pago SEM o desconto seria de: R$" + precoG + ". O valor de COM o desconto ser� de: R$" + valorfinal);
		
	}
	
	sc.close();
}	
}
