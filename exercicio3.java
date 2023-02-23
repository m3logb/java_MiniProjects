package curso_programacao;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int  A,B,C,D,DIF;
		
		A = sc.nextInt();
		sc.nextLine();
		B = sc.nextInt();
		sc.nextLine();
		C = sc.nextInt();
		sc.nextLine();
		D = sc.nextInt();
		sc.nextLine();
		
		DIF = A * B - C * D;
		
		System.out.printf("A diferença dos valores é: %d%n",DIF);
		
		
		
		sc.close();

	}

}
