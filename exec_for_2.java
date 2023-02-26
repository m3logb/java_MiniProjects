package curso_java_repeticao;

import java.util.Scanner;

public class exec_for_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for(int i=1;i<=N;i++) {
			
			int x = sc.nextInt();
			
			if (10<=x && x<= 20) {
				
				in +=1;
				
			}
			else {
				out +=1;
			}
			
			}
		
		System.out.printf("%d in%n",in);
		System.out.printf("%d out",out);
		
		
		sc.close();

	}

}
