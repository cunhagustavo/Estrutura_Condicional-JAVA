//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

package Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num;
		
		System.out.println("Vamos classificar números ímpares e pares! ");
		
		num = sc.nextInt();
				
		if (num % 2 == 0) {
			System.out.println("Número PAR");
		} 
		else {
			System.out.println("Número ÍMPAR");
		}
	
	
	
		sc.close();
	}

}
