package desvioCondicional;

import java.util.Scanner;

public class HoraTrabalhada22 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/* A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio que trabalhar mais 
de 40 horas receber� hora extra, cujo c�lculo � o valor da hora regular com um acr�scimo de 50%. 
Escreva um algoritmo que leia o n�mero de horas trabalhadas em um m�s, o sal�rio por hora e escreva 
o sal�rio total do funcion�rio, que dever� ser acrescido das horas extras, caso tenham sido trabalhadas 
(considere que o m�s possua 4 semanas exatas). */
		
		System.out.println("Digite a quantidade de horas trabalhadas no m�s: ");
		float horatrabalhada = sc.nextFloat();
		
		System.out.println("Digite o valor da hora trabalhada: ");
		float salariohora = sc.nextFloat();
		
		float salariomes = horatrabalhada * salariohora;
		
		if (salariomes > 40) {
			
        float reajuste = horatrabalhada - 40;
        float reajuste1 = (reajuste * horatrabalhada) / 2;
        
     
			System.out.println("O sal�rio com acr�scimo de horas extras � de: R$" + (salariomes + reajuste1));
			
		} else {
			
			System.out.println("O sal�rio do funcion�rio � de: R$ " + salariomes);
			
		}

		sc.close();
	}
}
