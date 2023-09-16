package exercicios_fixacao_vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int quantity = sc.nextInt();
		Student[] students = new Student[quantity];
		
		System.out.println();
		
		for(int i = 0; i < students.length; i++) {
			System.out.printf("Digite nome, primeira nota, segunda nota do %do aluno:%n", i + 1);
			sc.nextLine();
			String name = sc.nextLine();
			double firstGrade = sc.nextDouble();
			double secondGrade = sc.nextDouble();
			students[i] = new Student(name, firstGrade, secondGrade);
			
		}
		
		System.out.println("Alunos aprovados");
		
		for(int i = 0; i < students.length; i++) {
			if(students[i].getAverage() >= 6.0) {
				System.out.println(students[i].getName());
			}
		}

		sc.close();

	}

}
