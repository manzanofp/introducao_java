package desvioCondicional;

import java.util.Scanner;

public class CustoFabrica10 {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	/* O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do 
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor 
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, 
calcular e escrever o custo final ao consumidor.  */
	
	System.out.println("Digite o valor de fábrica do veiculo: ");
	float custofabrica = sc.nextFloat();
	float distribuidor = custofabrica / 100 * 28;
	float imposto = custofabrica / 100 * 45;
	float custofinal = custofabrica + distribuidor + imposto;
	
	System.out.println("O custo final do veículo é de: R$" + custofinal);
	
	
	
	
	sc.close();
}
}
