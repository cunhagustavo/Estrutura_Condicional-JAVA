//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
//A seguir, calcule e mostre o valor da conta a pagar.

package Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int codItem, qntdeItem;
		double total;
		
		System.out.println("================================================");
		System.out.println("  CODIGO          ESPECIFICAÇÃO          PREÇO");
		System.out.println("================================================");
		System.out.println("    1            Cachorro Quente        R$ 4.00");
		System.out.println("    2            X-Salada               R$ 4.50");
		System.out.println("    3            X-Bacon                R$ 5.00");
		System.out.println("    4            Torrada Simples        R$ 2.00");
		System.out.println("    5            Refrigerante           R$ 1.00");
		System.out.println("================================================");
		
		System.out.println();
		System.out.println("Qual o código do item desejado? ");
		codItem = sc.nextInt();
		System.out.println("Qual a quantidade do item desejado? ");
		qntdeItem = sc.nextInt();
		
		if (codItem == 1) {
			total = qntdeItem * 4.00;
			System.out.printf("Total: R$ %.2f%n", total);
		} 
		else if (codItem == 2) {
			total = qntdeItem * 4.50;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (codItem == 3) {
			total = qntdeItem * 5.00;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (codItem == 4) {
			total = qntdeItem * 2.00;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (codItem == 5) {
			total = qntdeItem * 1.50;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else  {
			System.out.println("Desculpe");
			System.out.println("Esse código não está presente no cardápio!");	
		}
		
		
		
		
		sc.close();
	}

}
