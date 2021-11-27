package desvioCondicional;

import java.util.Scanner;

public class ValorMaior28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		/*  Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. Ler 3 valores 
		 * (considere que não serão informados valores iguais) e escrever o maior deles.  */
		
		System.out.println("Digite o 1 valor: ");
		double v1 = sc.nextDouble();
		
		System.out.println("Digite o 2 valor: ");
		double v2 = sc.nextDouble();
		
		System.out.println("Digite o 3 valor: ");
		double v3 = sc.nextDouble();
		
		if (v1 > v2 && v1 > v3) {
			
		System.out.println("Dentre os números digitados: " + v1 + ", " + v2 + "e" + v3 + ". o maior valor digitado foi: " + v1 + ".");
		
		} else if (v2 > v1 && v2 > v3) {
			
			System.out.println("Dentre os números digitados: " + v1 + ", " + v2 + "e" + v3 + ". o maior valor digitado foi: " + v2 + ".");
			
		} else {
			
			System.out.println("Dentre os números digitados: " + v1 + ", " + v2 + "e" + v3 + ". o maior valor digitado foi: " + v3 + ".");
			
		}
		
	sc.close();	
	}
}
