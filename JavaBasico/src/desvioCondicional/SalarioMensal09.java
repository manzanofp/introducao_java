package desvioCondicional;

import java.util.Scanner;

public class SalarioMensal09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/*Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
Calcular e escrever o valor do novo salário.*/ 
		
		System.out.println("Digite o seu salário atual: ");
		float salariomensal = sc.nextInt();
		
		System.out.println("Digite a porcentagem de reajuste salárial: ");
		float salarioreajuste = sc.nextInt();
		
		float novosalario = (salariomensal * salarioreajuste / 100) + salariomensal;
		
		System.out.println("O seu novo salario é: R$" + novosalario);
		
		sc.close();
	}
}
