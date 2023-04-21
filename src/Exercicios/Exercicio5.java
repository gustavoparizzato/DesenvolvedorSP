package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma string: ");
		String string = sc.nextLine();

		char[] chars = string.toCharArray();

		int i = 0;
		int j = chars.length - 1;
		while (i < j) {
			char temporario = chars[i];
			chars[i] = chars[j];
			chars[j] = temporario;
			i++;
			j--;
		}

		String inverter = new String(chars);

		System.out.println("String invertida: " + inverter);
	
	sc.close();
	}
}
