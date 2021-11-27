package desvioCondicional;

import java.util.Scanner;

public class Sucessor {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	// O número sucessor
	
	int valor1;
	int suce;
	
	System.out.println("Insira um valor: ");
	valor1= sc.nextInt();
	
	suce = valor1 + 1;
	System.out.println("O número Sucessor é "+ suce);
	
	sc.close();
}
}
