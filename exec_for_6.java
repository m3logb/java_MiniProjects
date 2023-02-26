package curso_java_repeticao;

import java.util.Scanner;

public class exec_for_6 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int x = 1;
		
		for(int i=1;i<=N;i++) {
			
			
			if(N%x != 0)
			{
				x +=1;
			}
			else {
				System.out.println(x);
				x +=1;
				
			}
			

	}
		sc.close();
	}
}
//Ler um número inteiro N e calcular todos os seus divisores