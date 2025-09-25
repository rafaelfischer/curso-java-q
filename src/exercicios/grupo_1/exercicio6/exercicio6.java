/*
  	Objetivo do programa: Calcule a área de um círculo com base no raio informado.
							Como calcular: A = PI . R ao quadrado
    Data da criacao: 2025-08-28
    Criado por: @programacaomentoria
	Ultima atualizacao: 2025-09-16
    Alterado por: @rafaelfischer
*/

package Exercicios.Grupo_1.Exercicio6;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double PI = 3.14159;
		double raio, area;

		System.out.println("Exercicio 6 - Calculo da area de um circulo");
		System.out.println("------------------------------------------");

		System.out.print("Informe o valor do raio: ");
		raio = scanner.nextDouble();

		area = PI * (raio * raio);
		System.out.printf("A area do circulo de raio %.2f é: %.2f%n", raio, area);
		
		scanner.close();
	}
}