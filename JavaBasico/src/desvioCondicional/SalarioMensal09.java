package desvioCondicional;

import java.util.Scanner;

public class SalarioMensal09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/*Escreva um algoritmo para ler o sal�rio mensal atual de um funcion�rio e o percentual de reajuste.
Calcular e escrever o valor do novo sal�rio.*/ 
		
		System.out.println("Digite o seu sal�rio atual: ");
		float salariomensal = sc.nextInt();
		
		System.out.println("Digite a porcentagem de reajuste sal�rial: ");
		float salarioreajuste = sc.nextInt();
		
		float novosalario = (salariomensal * salarioreajuste / 100) + salariomensal;
		
		System.out.println("O seu novo salario �: R$" + novosalario);
		
		sc.close();
	}
}
