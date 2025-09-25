/*
	Objetivo do programa: Calcule a área de um quadrado.
							Como calcular: Area = lado * lado
    Data da criacao: 2025-08-28
    Criado por: @programacaomentoria
	Ultima atualizacao: 2025-09-16
    Alterado por: @rafaelfischer
*/

package Exercicios.Grupo_1.Exercicio5;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calculo da area de um quadrado");
		System.out.println("-------------------------------");
		
		System.out.print("Digite o valor do lado do quadrado: ");
		double lado = scanner.nextDouble();
		
		double area = lado * lado;
		System.out.printf("A area do quadrado e: %.2f\n", area);
		
		scanner.close();
	}
}