package exercicio_fixacao_vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int quantidade = sc.nextInt();
		double[] numeros = new double[quantidade];
		double maiorValor = 0;
		int indice = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
		}

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maiorValor) {
				maiorValor = numeros[i];
				indice = i;
			}
		}

		System.out.println();
		System.out.println("MAIOR VALOR = " + maiorValor);
		System.out.println("POSICAO DO MAIOR VALOR = " + indice);

		sc.close();

	}

}
