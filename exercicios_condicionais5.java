package curso_programacao;

import java.util.Scanner;

import java.util.Locale;

public class exercicios_condicionais5 {	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double quantidade = sc.nextDouble();
		
		double codigo = sc.nextDouble();
		
		double total;
		
		if (codigo == 1) {
			 
			total = quantidade * 4.00;
		}
		else if (codigo == 2) {
			 
			total = quantidade * 4.50;
		}
		else if (codigo == 3) {
			 
			total = quantidade * 5.00;
		}
		else if (codigo == 4) {
			 
			total = quantidade * 2.00;
		}
		else  {
			 
			total = quantidade * 1.50;
		}
		
		
		System.out.printf("O valor total é: %f%n",total);
		
		
		sc.close();
		
		
		
		
		
		
		
		
				
		
		
	}

}


//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.