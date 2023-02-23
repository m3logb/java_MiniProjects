package curso_programacao;

import java.util.Scanner;

public class exercicios_condicionais1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		
		int num;
		
		num = sc.nextInt();
		
		if (num >= 0) {
			
			System.out.println("Este número não é negativo!");
			
		}
		else {
			System.out.println("Este número é negativo!");
		}
		
		sc.close();
		
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.


	}

}
