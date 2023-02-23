package curso_programacao;

import java.util.Scanner;

public class exercicios_condicionais3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		A =sc.nextInt();
		B = sc.nextInt();
		
		if (A%2 == 0 || B%2 == 0) {
			
			System.out.println("São Multiplos!");
		}
		else {
			System.out.println("Não são multiplos!");
		}
		sc.close();
		
		

	}

}


//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.