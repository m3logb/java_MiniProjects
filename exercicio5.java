package curso_programacao;

import java.util.Scanner;
import java.util.Locale;

public class exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num1, quant1, num2, quant2;
		Double preco1, preco2, total1, total2, totalPreco;
		
		num1 = sc.nextInt();
		quant1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		num2 = sc.nextInt();
		quant2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		total1 = quant1 * preco1;
		total2 = quant2 * preco2;
		totalPreco = total1 + total2;
		
		System.out.printf("VALOR A PAGAR: $ %.2f%n",totalPreco);
		
		
		sc.close();
		
		
		
		
		

	}

}
