package curso_programacao;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vl1, vl2, soma;
		
		vl1=sc.nextInt();
		sc.nextLine();
		vl2=sc.nextInt();
		sc.nextLine();
		soma = vl1 + vl2;
		
		
		
		System.out.printf("A SOMA É = %d%n",soma);		
		
		
		sc.close();
		
		//Faça um programa para ler dois valores inteiros

	}

}
