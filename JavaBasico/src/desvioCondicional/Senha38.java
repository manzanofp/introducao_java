package desvioCondicional;

import java.util.Scanner;

public class Senha38 {

	public static void main(String[] args) {
	
Scanner sc = new Scanner (System.in);
		
/* Fa�a um algoritmo para ler um n�mero que � um c�digo de usu�rio. Caso este c�digo seja 
diferente de um c�digo armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a 
mensagem �Usu�rio inv�lido!�. Caso o C�digo seja correto, deve ser lido outro valor que � a senha. Se 
esta senha estiver incorreta (a certa � 9999) deve ser mostrada a mensagem �senha incorreta�. Caso a 
senha esteja correta, deve ser mostrada a mensagem �Acesso permitido�. */ 

System.out.println("Digite o usu�rio: ");
int usuario = sc.nextInt();

int senha= 0;

if (usuario != 1234 ) {
	
	System.out.println("Usu�rio invalido! Tente novamente.");
	
} else {
	
	System.out.println("Bem-vindo!");
	System.out.println("Digite a sua senha: ");
	
     senha = sc.nextInt();
	
} 

if (senha != 9999) {
	
	System.out.println("Senha invalida! Tente novamente.");
	
} else if (senha == 9999) {
	
	System.out.println("Acesso permitido!");
	
}
sc.close();
}
}
