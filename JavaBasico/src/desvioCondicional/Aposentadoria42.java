package desvioCondicional;

import java.util.Scanner;

public class Aposentadoria42 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner (System.in);

/* Uma empresa quer verificar se um empregado est� qualificado para a aposentadoria ou n�o. Para 
estar em condi��es, um dos seguintes requisitos deve ser satisfeito: 
Com base nas informa��es acima, fa�a um algoritmo que leia: o n�mero do empregado (c�digo), o ano 
de seu nascimento e o ano de seu ingresso na empresa. O programa dever� escrever a idade e o tempo 
de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'N�o requerer'. */
		
System.out.println("Digite o seu c�digo de funcion�rio: ");
float codigo = sc.nextFloat();

System.out.println("Digite o ano de seu nascimento: ");
float nasc = sc.nextFloat();

System.out.println("Digite o ano em que ingressou na empresa: ");
float anoemp = sc.nextFloat();

float temptrab = 2021 - anoemp;
float idade = 2021 - nasc;


if (idade >= 65 || temptrab >= 30) {
	
	System.out.println("Requer aposentadoria.");
	
} else if (idade >= 60 && temptrab >= 25) {
	
	System.out.println("Requer aposentadoria.");
	
} else {
	
	System.out.println("N�o requer aposentadoria.");
	
}
sc.close();
	}
	
}
