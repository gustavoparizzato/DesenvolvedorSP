package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int n = sc.nextInt();

		int a = 0;
		int b = 1;
		int fibonacci  = 0;

		while (fibonacci < n) {
			fibonacci = a + b;
			a = b;
			b = fibonacci;
		}

		if (fibonacci == n) {
			System.out.println(n + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println(n + " não pertence à sequência de Fibonacci.");
		}
		
		sc.close();
	}
}
