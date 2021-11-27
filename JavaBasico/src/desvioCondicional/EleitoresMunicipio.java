package desvioCondicional;

import java.util.Scanner;

public class EleitoresMunicipio {
	
public static void main (String[]args) {
	
	Scanner sc = new Scanner (System.in);
	
	/*Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
	brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
	de eleitores.*/
	
	System.out.println("Digite o número total de eleitores do seu município: ");
	int eleitor = sc.nextInt();
	
	System.out.println("Digite o número de votos em branco: ");
	int branco = sc.nextInt();
	float branco1 = branco;
	
	System.out.println("Digite o número de votos nulos: ");
	int nulos =  sc.nextInt();
	float nulos1 = nulos;
	
	System.out.println("Digite o número de votos válidos: ");
	int validos = sc.nextInt();
	float validos1 = validos;
		
	
	
	System.out.println("A média de votos brancos é: " + branco1 * 100 / eleitor + "%");
	System.out.println("A média de votos nulos é: " + nulos1 * 100 / eleitor + "%");
	System.out.println("A média de votos válidos é: " + validos1 * 100 / eleitor + "%");

	
	sc.close();
}
}
