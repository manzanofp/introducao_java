package desvioCondicional;

import java.util.Scanner;

public class JogoXadrez21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/* Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os 
minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é 
de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. */ 
		
		System.out.println("Digite a hora de inicio do jogo: ");
		int horainicio = sc.nextInt();
		
		System.out.println("Digite a hora na qual o jogo acabou: ");
		int horafinal = sc.nextInt();
		
		if(horainicio > horafinal) {
			
			int horatotal = horafinal - horainicio + 24;
			
			System.out.println("O total de horas corridas do jogo é de: " + horatotal);
			
		} else {
			
		int totalhora = horafinal - horainicio;
		
		System.out.println("O total de horas corridas do jogo é de: " + totalhora);
			
		}
		
		sc.close();
	}	
}
