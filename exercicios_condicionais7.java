package curso_programacao;

import java.util.Scanner;

import java.util.Locale;

public class exercicios_condicionais7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (y >0 & x<0) {
			
			System.out.println("Q2");
		}
		else if (y>0 & x>0) {
			
			System.out.println("Q1");
		}
		else if (y<0 & x>0) {
			
			System.out.println("Q4");
		}
		else if (y<0 & x<0) {
			
			System.out.println("Q3");
		}
		else {
			System.out.println("ORIGEM");
		}
		sc.close();
		

	}

}


//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação.