package desvioCondicional;

import java.util.Scanner;

public class SalarioTotal24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		/* Ler o sal�rio fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que 
ele recebe uma comiss�o de 3% sobre o total das vendas at� R$ 1.500,00 mais 5% sobre o que 
ultrapassar este valor, calcular e escrever o seu sal�rio total. */
		
		System.out.println("Digite o sal�rio fixo do funcion�rio: ");
		double salariofixo = sc.nextDouble();
		
		System.out.println("Digite o valor das vendas efetuadas: ");
		double valorvenda = sc.nextDouble();
		
		double salario1 = salariofixo + ((valorvenda * 3) / 100);
		
		if(valorvenda <= 1500) {
			
			System.out.println("O seu sal�rio � de: R$ " + salario1);
			
		} else {
			
			double salario2 = salario1 + ((valorvenda * 5) / 100);
			System.out.println("O seu sal�rio � de: R$ " + salario2);
			
		}
		
	
		
		sc.close();
	}
}
