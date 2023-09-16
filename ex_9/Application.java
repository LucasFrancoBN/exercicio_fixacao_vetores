package exercicios_fixacao_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos pessoas voce vai digitar? ");
		int quantity = sc.nextInt();
		String[] persons = new String[quantity];
		int[] ages = new int[quantity];
		int indexPersonMostOld = 0, olderAge;

		for (int i = 0; i < quantity; i++) {
			System.out.printf("Dados da %da pessoa%n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			persons[i] = sc.nextLine();
			System.out.print("Idade: ");
			ages[i] = sc.nextInt();
		}

		olderAge = ages[0];

		for (int i = 0; i < ages.length; i++) {
			if (ages[i] > olderAge) {
				olderAge = ages[i];
				indexPersonMostOld = i;
			}
		}

		System.out.printf("PESSOA MAIS VELHA: %s%n", persons[indexPersonMostOld]);

		sc.close();

	}

}
