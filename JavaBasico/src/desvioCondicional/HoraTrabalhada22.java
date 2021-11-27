package desvioCondicional;

import java.util.Scanner;

public class HoraTrabalhada22 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/* A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais 
de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva 
o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas 
(considere que o mês possua 4 semanas exatas). */
		
		System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
		float horatrabalhada = sc.nextFloat();
		
		System.out.println("Digite o valor da hora trabalhada: ");
		float salariohora = sc.nextFloat();
		
		float salariomes = horatrabalhada * salariohora;
		
		if (salariomes > 40) {
			
        float reajuste = horatrabalhada - 40;
        float reajuste1 = (reajuste * horatrabalhada) / 2;
        
     
			System.out.println("O salário com acréscimo de horas extras é de: R$" + (salariomes + reajuste1));
			
		} else {
			
			System.out.println("O salário do funcionário é de: R$ " + salariomes);
			
		}

		sc.close();
	}
}
