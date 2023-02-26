package curso_java_repeticao;

import java.util.Scanner;

import java.util.Locale;

public class exec_for_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1;i<=N;i++)
		{
			
			double t1 = sc.nextDouble();
			double t2 = sc.nextDouble();
			double t3 = sc.nextDouble();
			double md = (t1*2+t2*3+t3*5)/ 10;
			
				System.out.printf("%.1f",md);
			
		}
		
		sc.close();
		
		

	}

}
//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais