package curso_programacao;

import java.util.Scanner;

public class exercicios_condicionais2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		
		int num;
		
		num = sc.nextInt();
		
		if (num%2 == 0 )	{
			System.out.println("Este número é par!");
		}
		else {
			System.out.println("Este número é impar");
		}
		sc.close();
		
		

	}

}



//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
