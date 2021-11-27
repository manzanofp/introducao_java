package desvioCondicional;

import java.util.Scanner;

public class SalarioTotal24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		/* Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que 
ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que 
ultrapassar este valor, calcular e escrever o seu salário total. */
		
		System.out.println("Digite o salário fixo do funcionário: ");
		double salariofixo = sc.nextDouble();
		
		System.out.println("Digite o valor das vendas efetuadas: ");
		double valorvenda = sc.nextDouble();
		
		double salario1 = salariofixo + ((valorvenda * 3) / 100);
		
		if(valorvenda <= 1500) {
			
			System.out.println("O seu salário é de: R$ " + salario1);
			
		} else {
			
			double salario2 = salario1 + ((valorvenda * 5) / 100);
			System.out.println("O seu salário é de: R$ " + salario2);
			
		}
		
	
		
		sc.close();
	}
}
