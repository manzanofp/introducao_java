package desvioCondicional;

import java.util.Scanner;

public class TimeVencedor32 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		/*  Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome 
do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE */
		
		
		System.out.println("Digite o nome do primeiro time: ");
		var time1 = sc.next();
		
		System.out.println("Digite o nome do segundo time: ");
		var time2 = sc.next();
		
		System.out.println("Digite quantos gols o primeiro time fez: ");
		int gols1 = sc.nextInt();
		
		System.out.println("Digite quanto gols o segundo time fez: ");
		int gols2 = sc.nextInt();
		
		if(gols1 > gols2) {
			
			System.out.println("O time " + time1 + "ganhou a partida com " + gols1 + "gols.");
			
		} else if (gols1 == gols2) {
			
			System.out.println("temos um empate!");
			
		} else if (gols1 < gols2) {
			
			System.out.println("O time " + time2 + "ganhou a partida com " + gols2 + "gols.");
			
		}
		
		sc.close();	
	}
}
