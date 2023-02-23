package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double num,hr,vlrhr,salario;
		
		num = sc.nextDouble();
		hr = sc.nextDouble();
		vlrhr = sc.nextDouble();
		salario = hr * vlrhr;
		
		System.out.printf("NUMBER = %.0f %nSALARY = $ %.2f%n",num,salario);
		
		
		
		
		sc.close();
		
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas
		//o valor que recebe por
		//hora e calcula o salário desse funcionário

	}

}
