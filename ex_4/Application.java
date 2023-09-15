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
		int[] numeros = new int[quantidade];
		int quantidadePares = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES:");
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {			
				quantidadePares++;
				System.out.print(numeros[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + quantidadePares);
		
		
		sc.close();
		
	}

}
