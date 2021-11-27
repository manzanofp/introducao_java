package desvioCondicional;

import java.util.Scanner;

public class NotaAluno41 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner (System.in);

/* Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos 
exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo 
e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:  */
		
System.out.println("Digite a primeira nota do aluno: ");
int n1 = sc.nextInt();

System.out.println("Digite a segunda nota do aluno: ");
int n2 = sc.nextInt();

System.out.println("Digite a terceira nota do aluno: ");
int n3 = sc.nextInt();

System.out.println("Digite a média dos exercícios do aluno: ");
int mediaex = sc.nextInt();

int mediaaprov = (n1 + (n2 * 2) + (n3 * 3 ) + mediaex) / 7;

if (mediaaprov >= 9) {
	
	System.out.println("O aluno recebeu nota A!");
	
} else if (mediaaprov >= 7.5 && mediaaprov < 9.0) {
	
	System.out.println("O aluno recebeu nota B!");
	
} else if (mediaaprov > 6.0 && mediaaprov < 7.5) {
	
System.out.println("O aluno recebeu nota C!");	
	
}else if (mediaaprov < 5.9) {
	
	System.out.println("O aluno recebeu nota D!");
	
}

sc.close();
	}
}
