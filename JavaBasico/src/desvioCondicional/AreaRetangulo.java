package desvioCondicional;

import java.util.Scanner;

public class AreaRetangulo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	// Calcule a �rea do Quadrado
	
	float altura;
	float base;
	float area;
	
	System.out.println("Digite a altura: ");
	altura= sc.nextInt();
	
    System.out.println("Digite a base: ");
    base= sc.nextInt();
    
    area = altura * base;
    System.out.println("A �rea do ret�ngulo �: " + area + "cm�");
    
    sc.close();
	
}
}
