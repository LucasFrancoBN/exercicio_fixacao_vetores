package exercicios_fixacao_vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;
import entities.Student;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos pessoas serao digitadas? ");
		int quantity = sc.nextInt();
		Person[] persons = new Person[quantity];
		
		double shorterHeight, greaterHeight, averageFemaleHeight = 0;
		int numberOfMen = 0;
		
		System.out.println();
		
		for(int i = 0; i < persons.length; i++) {
			System.out.printf("Altura da %d pessoa: ", i + 1);
			double height = sc.nextDouble();
			System.out.printf("Genero da %d pessoa: ", i + 1);
			sc.nextLine();
			char gender = sc.nextLine().charAt(0);
			persons[i] = new Person(gender, height);
			
		}
		
		shorterHeight = persons[0].getHeight();
		greaterHeight = persons[0].getHeight();
		
		
		for(int i = 0; i < persons.length; i++) {
			if(persons[i].getHeight() < shorterHeight) {
				shorterHeight = persons[i].getHeight();
			} else if(persons[i].getHeight() > greaterHeight) {
				greaterHeight = persons[i].getHeight();
			}
			if(persons[i].getGender() == 'F') {
				averageFemaleHeight += persons[i].getHeight();
			} else {
				numberOfMen++;
			}
		}
		
		System.out.printf("Menor Altura = %.2f%n", shorterHeight);
		System.out.printf("Maior Altura = %.2f%n", greaterHeight);
		System.out.printf("Media das alturas das mulheres = %.2f%n", averageFemaleHeight / (persons.length - numberOfMen));
		System.out.printf("Numero de homens = %d", numberOfMen);		

		sc.close();

	}

}
