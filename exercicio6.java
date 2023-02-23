package curso_programacao;

import java.util.Scanner;
import java.util.Locale;

public class exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, area,pi;
		
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		pi = 3.14159;
		
		area = pi * Math.pow(C, 2);
		
		
		
		System.out.printf("CIRCULO: %.3f%n",area);
		
		
		
		
		sc.close();
		
		
		//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
		//a área do triângulo retângulo que tem A por base e C por altura.
		// A = B*H/2
		//a área do círculo de raio C. (pi = 3.14159) 
		//area = π . raio2

	}

}
