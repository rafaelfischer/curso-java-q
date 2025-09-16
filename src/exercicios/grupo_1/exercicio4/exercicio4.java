/*
	Objetivo do programa: Calcule o quadrado de um número
	Data da criacao: 2025-08-28
	Criado por: @programacaomentoria
	Ultima atualizacao: 2025-09-16
	Alterado por: @rafaelfischer
*/

package exercicios.grupo_1.exercicio4;
import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Programa para calcular o quadrado de um numero");
		System.out.println("----------------------------------------------");

		System.out.print("Digite um numero: ");
		double numero = scanner.nextDouble();

		double quadrado = numero * numero;
		System.out.printf("O quadrado de %.2f e: %.2f\n", numero, quadrado);

		scanner.close();
	}
}