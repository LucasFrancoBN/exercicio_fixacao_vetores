package exercicio_fixacao_vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos pessoas serão digitadas? ");
		int quantidadePessoas = sc.nextInt();
		Pessoa[] pessoas = new Pessoa[quantidadePessoas];
		double mediaAlturas = 0, porcentagemMenoresDe16 = 0;
		
		for(int i = 0; i < pessoas.length; i++) {
			System.out.println("Dados da " + (i+ 1) + "a" + " pessoa");
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			System.out.println();
			pessoas[i] = new Pessoa(nome, idade, altura);
		}
		
		for(int i = 0; i < pessoas.length; i++) {
			mediaAlturas += pessoas[i].getAltura();
			if(pessoas[i].getIdade() < 16) {
				porcentagemMenoresDe16++;
			}
		}
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", mediaAlturas/pessoas.length);
		System.out.println("Pessoas com menos de 16 anos: " + (porcentagemMenoresDe16/pessoas.length*100) + "%");
		
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getIdade() < 16) {
				System.out.println(pessoas[i].getNome());
			}
		}
		sc.close();
		
	}

}
