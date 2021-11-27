package desvioCondicional;

import java.util.Scanner;

public class AreaCirculo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//Calcule a área do Circulo
	
	double raio;
	double area;
	
	System.out.println("Digite o raio: ");
	raio= sc.nextInt();

	
	area = 3.1416 * (Math.pow(raio, 2));
	System.out.println("O valor da area é: " + area);
	
	
	
	sc.close();
}
}
