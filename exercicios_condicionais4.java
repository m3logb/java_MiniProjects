package curso_programacao;

import java.util.Scanner;

public class exercicios_condicionais4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hrin, hrfin, duracao;
		
		System.out.println("digite a hora inicial do jogo");
		hrin = sc.nextInt();
		System.out.println("digite a hora final do jogo");
		hrfin = sc.nextInt();
		
		if (hrin < hrfin)	{
			duracao = hrfin - hrin;
			
		}
		else	{
			
			duracao = 24 - hrin + hrfin;
		}
		
		System.out.println("o jogo durou " + duracao + " horas");
		
		
		sc.close();
		
	}

}

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
