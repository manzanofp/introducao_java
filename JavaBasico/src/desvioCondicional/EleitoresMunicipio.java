package desvioCondicional;

import java.util.Scanner;

public class EleitoresMunicipio {
	
public static void main (String[]args) {
	
	Scanner sc = new Scanner (System.in);
	
	/*Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o n�mero de votos
	brancos, nulos e v�lidos. Calcular e escrever o percentual que cada um representa em rela��o ao total
	de eleitores.*/
	
	System.out.println("Digite o n�mero total de eleitores do seu munic�pio: ");
	int eleitor = sc.nextInt();
	
	System.out.println("Digite o n�mero de votos em branco: ");
	int branco = sc.nextInt();
	float branco1 = branco;
	
	System.out.println("Digite o n�mero de votos nulos: ");
	int nulos =  sc.nextInt();
	float nulos1 = nulos;
	
	System.out.println("Digite o n�mero de votos v�lidos: ");
	int validos = sc.nextInt();
	float validos1 = validos;
		
	
	
	System.out.println("A m�dia de votos brancos �: " + branco1 * 100 / eleitor + "%");
	System.out.println("A m�dia de votos nulos �: " + nulos1 * 100 / eleitor + "%");
	System.out.println("A m�dia de votos v�lidos �: " + validos1 * 100 / eleitor + "%");

	
	sc.close();
}
}
