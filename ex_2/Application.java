package exercicio_fixacao_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números serão digitados? ");
		int quantity = sc.nextInt();
		double[] numbers = new double[quantity];
		double sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um numero: ");
			numbers[i] = sc.nextDouble();
		}
		System.out.print("VALORES = ");
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");	
		}
		System.out.println();
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println();
		System.out.println("SOMA = " + sum);
		System.out.println("MEDIA = " + sum/numbers.length);
		
		sc.close();
		
	}

}
