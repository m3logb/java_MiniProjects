package curso_java_repeticao;

import java.util.Scanner;

public class exec_for_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1;i<=N;i++) {
			
			double p1 = sc.nextDouble();
			double p2 = sc.nextDouble();
			double result;
			if(p2 != 0) {
			
				 result = (p1/p2);
				 System.out.println(result);
				
			}
			else {
				System.out.println("Divisão Impossivel!");
			}
			
			
			
			
		}
		
		
		sc.close();
		

	}

}


//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".