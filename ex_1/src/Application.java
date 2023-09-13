package exercicio_fixacao_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números serão digitados? ");
		int quantity = sc.nextInt();
		int[] numbers = new int[quantity];
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um numero: ");
			numbers[i] = sc.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS:");
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < 0) {
				System.out.println(numbers[i]);
			}
		}

	}

}
