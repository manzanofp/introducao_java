package desvioCondicional;

import java.util.Scanner;

public class Triangulo31 {

public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	/* Ler 3 valores (A, B e C) representando as medidas dos lados de um tri�ngulo e escrever se formam 
ou n�o um tri�ngulo. OBS: para formar um tri�ngulo, o valor de cada lado deve ser menor que a soma 
dos outros 2 lados. */
	
	System.out.println("Digite o valor do primeiro lado: ");
	int a = sc.nextInt();
	
	System.out.println("Digite o valor do segundo lado: ");
	int b = sc.nextInt();
	
	System.out.println("Digite o valor do terceiro lado: ");
	int c = sc.nextInt();
	
	if(a < b + c && b < a + c && c < b + a) {
		
		System.out.println(" � UM TRI�NGULO!");
		
	} else {
		
		System.out.println(" N�O � UM TRI�NGULO!");
		
	}
	sc.close();
}	
}
