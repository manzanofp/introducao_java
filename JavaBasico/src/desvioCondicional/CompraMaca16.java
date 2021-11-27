package desvioCondicional;

import java.util.Scanner;

public class CompraMaca16 {

public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	/*As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem 
compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e 
escreva o custo total da compra. */
	
	System.out.println("Digite a quantidade de maças compradas: ");
	int macacomprada = sc.nextInt();
	
	double valorfinal;
	
	if(macacomprada < 12) {
		
		valorfinal = macacomprada * 1.30;
		
		System.out.println("Comprando " + macacomprada + " o preço final é: R$ " + valorfinal);
		
	} else if (macacomprada >= 12) {
	
	 valorfinal = macacomprada * 1.00;
		
	 System.out.println("Comprando " + macacomprada + " o preço final é: R$ " + valorfinal);
	 
	}
	sc.close();
}	
}
