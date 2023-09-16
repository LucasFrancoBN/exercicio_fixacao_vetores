package exercicios_fixacao_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int quantity = sc.nextInt();
		int[] vect = new int[quantity];
		int evenQuantity = 0;
		int evenSum = 0;
		double evenAverage;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				evenQuantity++;
				evenSum += vect[i];
			}
		}
		
		if(evenQuantity == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			evenAverage = evenSum / evenQuantity;
			System.out.printf("MEDIA DOS PARES = %.1f%n", evenAverage);
		}
		
		
		sc.close();
		
	}

}
