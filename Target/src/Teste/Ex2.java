package Teste;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma = 0, numA = 0, numP = 1;
		boolean encontrou = false;

		System.out.println("Digite o numero para descobrir se esta na sequencia fibonacci");
		int num = ler.nextInt();

		while (soma <= num) {

			if (numA == 0) {
				System.out.print(numA);
				System.out.print(",");
				System.out.print(numP);
				System.out.print(",");
				soma += numA + numP;
			}
			System.out.print(soma);
			System.out.print(",");
			numA = numP;
			numP = soma;
			soma = numA + numP;

			if (soma == num || num == 0 || num == 1) {
				encontrou = true;
			}
		}
		System.out.println("\n");
		if (encontrou == true) {
			System.out.println("O numero " + num + " esta na sequencia fibonacci.");
		} else {
			System.out.println("O numero " + num + " nao esta na sequencia fibonacci.");
		}

	}
}
