package desvioCondicional;

import java.util.Scanner;

public class SalarioVendedor11 {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	/* Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, 
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele 
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas 
vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do 
vendedor. */
	
	System.out.println("Digite o seu salário fixo: R$");
	float salariofixo = sc.nextFloat();
	
	System.out.println("Digite o valor da sua comissão: ");
	float salariocomissao = sc.nextFloat();
	
	System.out.println("Digite o total de carros vendidos: ");
	int totalcarro = sc.nextInt();
	
	System.out.println("Digite o total de suas vendas: ");
	int totalvenda = sc.nextInt();
	
	float comissaocarro = salariocomissao * totalcarro;
	float comissao2 = totalvenda / 100 * 5;
	float salariofinal = comissaocarro + comissao2 + salariofixo;
	
	System.out.println("O salário final do vendedor é: R$" + salariofinal);
	
	
	sc.close();
}
}
