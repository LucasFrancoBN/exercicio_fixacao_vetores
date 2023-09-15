package exercicios_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int quantity = sc.nextInt();
		System.out.println();
		int[] vectA = new int[quantity];
		int[] vectB = new int[quantity];
		int[] resultVect = new int[quantity];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor b:");
		for(int i = 0; i < vectB.length; i++) {
			vectB[i] = sc.nextInt();
		}
		
		for(int i = 0; i < resultVect.length; i++) {
			resultVect[i] = vectA[i] + vectB[i];
		}
		
		System.out.println("VETOR RESULTANTE");
		for(int i = 0; i < resultVect.length; i++) {
			System.out.println(resultVect[i]);
		}
		
	}

}
