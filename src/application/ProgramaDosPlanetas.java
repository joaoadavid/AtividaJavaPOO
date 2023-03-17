package application;

import java.util.Scanner;

import entities.CalculaPesoNoPlaneta;
import entities.Jupiter;
import entities.Marte;
import entities.Mercurio;
import entities.Netuno;
import entities.Saturno;
import entities.Terra;
import entities.Urano;
import entities.Venus;

public class ProgramaDosPlanetas {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o seu peso em kg: ");
		double pesoNaTerra = scanner.nextDouble();

		CalculaPesoNoPlaneta[] planetas = { new Mercurio(), new Venus(), new Terra(), new Marte(), new Jupiter(),
				new Saturno(), new Urano(), new Netuno() };

		System.out.println("Escolha um planeta para viajar:");
		for (int i = 0; i < planetas.length; i++) {
			System.out.println(i + ". " + planetas[i].getNome());
		}

		System.out.print("Digite o número do planeta escolhido: ");
		int indexPlaneta = scanner.nextInt();

		if (indexPlaneta < 0 || indexPlaneta >= planetas.length) {
			System.out.println("Planeta inválido!");
		} else {
			CalculaPesoNoPlaneta planetaEscolhido = planetas[indexPlaneta];
			double pesoNoPlaneta = planetaEscolhido.getPeso(pesoNaTerra);

			System.out.println("Seu peso no planeta " + planetaEscolhido.getNome() + " é de " + pesoNoPlaneta + " kg ");
		}

		scanner.close();
	}
}
