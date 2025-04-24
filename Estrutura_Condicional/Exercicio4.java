//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

package Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		int horaInicio, horaFinal, duracaoJogo;
		
		System.out.println("Vamos calcular a duração de um Jogo!\n");
		
		System.out.println("Informe a hora inicial:");
		horaInicio = sc.nextInt();
		
		System.out.println("Agora a hora final:");
		horaFinal = sc.nextInt();
		
		if(horaInicio < horaFinal) {
			duracaoJogo = horaFinal - horaInicio;
		}
		else {
			duracaoJogo = 24 - horaInicio + horaFinal;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", duracaoJogo);
		
		
	
		sc.close();
	}

}
