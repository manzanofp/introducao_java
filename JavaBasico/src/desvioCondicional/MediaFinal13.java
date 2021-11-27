package desvioCondicional;

import java.util.Scanner;

public class MediaFinal13 {

	public static void main(String[] args) {
	
Scanner sc = new Scanner (System.in);

/*  Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno. 
Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média 
final é: */ 

System.out.println("Digite a sua primeira nota: ");
double nota1 = sc.nextDouble();

System.out.println("Digite a sua segunda nota: ");
double nota2 = sc.nextDouble();

System.out.println("Digite a sua terceira nota: ");
double nota3 = sc.nextDouble();

double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

System.out.println("A média final do aluno é: " + media);

		sc.close();
	}
}
