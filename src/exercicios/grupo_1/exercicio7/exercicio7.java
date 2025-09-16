/*
  	Objetivo do programa: Calcule a área de um retângulo
							Area = comprimento * altura
    Data da criacao: 2025-08-28
    Criado por: @programacaomentoria
	Ultima atualizacao: 2025-09-16
    Alterado por: @rafaelfischer
*/

package exercicios.grupo_1.exercicio7;
import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Exercício 7 - Calculo da area de um retangulo");
		System.out.println("-------------------------------");

		System.out.print("Informe o comprimento: ");
		double comprimento = scanner.nextDouble();
		System.out.print("Informe a altura: ");
		double altura = scanner.nextDouble();

		double area = comprimento * altura;
		System.out.printf("A area do retangulo eh: %.2f%n", area);

		scanner.close();
	}
}