package desvioCondicional;

import java.util.Scanner;

public class MediaFinal13 {

	public static void main(String[] args) {
	
Scanner sc = new Scanner (System.in);

/*  Fa�a um algoritmo que leia tr�s notas de um aluno, calcule e escreva a m�dia final deste aluno. 
Considerar que a m�dia � ponderada e que o peso das notas � 2, 3 e 5. F�rmula para o c�lculo da m�dia 
final �: */ 

System.out.println("Digite a sua primeira nota: ");
double nota1 = sc.nextDouble();

System.out.println("Digite a sua segunda nota: ");
double nota2 = sc.nextDouble();

System.out.println("Digite a sua terceira nota: ");
double nota3 = sc.nextDouble();

double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

System.out.println("A m�dia final do aluno �: " + media);

		sc.close();
	}
}
