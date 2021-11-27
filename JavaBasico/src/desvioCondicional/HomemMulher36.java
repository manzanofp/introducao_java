package desvioCondicional;

import java.util.Scanner;

public class HomemMulher36 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner (System.in);

/*  Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades 
dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma 
das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais 
novo com a mulher mais velha. */
		
System.out.println("Insira a idade do primeiro homem: ");
int homem1 = sc.nextInt();

System.out.println("insira a idade do segundo homem: ");
int homem2 = sc.nextInt();

System.out.println("Insira a idade da primeira mulher: ");
int mulher1 = sc.nextInt();

System.out.println("Insira a idade da segunda mulher: ");
int mulher2 = sc.nextInt();

if (homem1 > homem2 && mulher1 > mulher2) {
	
int soma1 = homem1 + mulher2;
int soma2 = homem2 * mulher1;

System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + soma1 + " e " + "o produto da idade do homem mais novo com a mulher mais velha é: " + soma2);

} else if (homem1 < homem2 && mulher1 < mulher2) {
	
	int soma1 = homem2 + mulher1;
	int soma2 = homem1 * mulher2;
	
	System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + soma1 + " e " + "o produto da idade do homem mais novo com a mulher mais velha é: " + soma2);
	
}else if (homem1< homem2 && mulher1 > mulher2) {
	
	int soma1 = homem2 + mulher2;
	int soma2 = homem1 * mulher1;
	
	System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + soma1 + " e " + "o produto da idade do homem mais novo com a mulher mais velha é: " + soma2);

} else if (homem1 > homem2 && mulher1 < mulher2) {
	
	int soma1= homem1 + mulher1;
	int soma2 = homem2 + mulher2;
	
	System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + soma1 + " e " + "o produto da idade do homem mais novo com a mulher mais velha é: " + soma2);

}
sc.close();
}	
}
