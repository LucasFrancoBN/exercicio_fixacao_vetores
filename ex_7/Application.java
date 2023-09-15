package exercicios_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter o vetor? ");
		int quantity = sc.nextInt();
		System.out.println();
		double[] vect = new double[quantity];	
		double average = 0.0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero ");
			vect[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < vect.length; i++) {
			average += vect[i];
		}
		
		average /= vect.length;
		
		System.out.printf("MEDIA DO VETOR = %.3f%n", average);		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < average) {
				System.out.printf("%.2f%n", vect[i]);				
			}
		}
		
		sc.close();
		
	}

}
