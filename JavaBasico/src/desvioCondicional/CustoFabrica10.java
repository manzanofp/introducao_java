package desvioCondicional;

import java.util.Scanner;

public class CustoFabrica10 {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	/* O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do 
distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que o percentual do distribuidor 
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de f�brica de um carro, 
calcular e escrever o custo final ao consumidor.  */
	
	System.out.println("Digite o valor de f�brica do veiculo: ");
	float custofabrica = sc.nextFloat();
	float distribuidor = custofabrica / 100 * 28;
	float imposto = custofabrica / 100 * 45;
	float custofinal = custofabrica + distribuidor + imposto;
	
	System.out.println("O custo final do ve�culo � de: R$" + custofinal);
	
	
	
	
	sc.close();
}
}
