package desvioCondicional;

import java.util.Scanner;

public class TesteMesa34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/* Faça um teste de mesa e complete o quadro a seguir para os seguintes valores: */
		
		System.out.println("Digite o valor de X: ");
		int x = sc.nextInt();
		
		System.out.println("Digite o valor de Y: ");
		int y = sc.nextInt();
		
		int z = (x*y) + 5;
		System.out.println("O valor de Z é = " + z);
		
		if (z <= 0 ) {
			
			System.out.println("A resposta é 'A'.");
			
		} else if (z <= 100) {
			
			System.out.println("A resposta é 'B'.");
			
		} else {
			
			System.out.println("A resposta é 'C'.");
			
		}
		
		sc.close();
	}	
}
