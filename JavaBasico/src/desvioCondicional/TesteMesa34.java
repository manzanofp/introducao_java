package desvioCondicional;

import java.util.Scanner;

public class TesteMesa34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/* Fa�a um teste de mesa e complete o quadro a seguir para os seguintes valores: */
		
		System.out.println("Digite o valor de X: ");
		int x = sc.nextInt();
		
		System.out.println("Digite o valor de Y: ");
		int y = sc.nextInt();
		
		int z = (x*y) + 5;
		System.out.println("O valor de Z � = " + z);
		
		if (z <= 0 ) {
			
			System.out.println("A resposta � 'A'.");
			
		} else if (z <= 100) {
			
			System.out.println("A resposta � 'B'.");
			
		} else {
			
			System.out.println("A resposta � 'C'.");
			
		}
		
		sc.close();
	}	
}
