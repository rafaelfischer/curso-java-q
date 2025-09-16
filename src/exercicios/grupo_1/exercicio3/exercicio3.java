/*
	Objetivo do programa: Perguntar o nome de um aluno, pergunte as 4 notas e calcule a média aritmética, exibindo no final.
	Data da criacao: 2025-08-28
	Criado por: @programacaomentoria
	Ultima atualizacao: 2025-09-16
	Alterado por: @rafaelfischer
*/

package exercicios.grupo_1.exercicio3;
import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Exercicio 3 - Calculo de media aritmetica");
		System.out.println("-----------------------------------------");

		System.out.print("Digite o nome do aluno: ");
		String nome = scanner.nextLine();

		System.out.print("Digite a primeira nota: ");
		float nota1 = scanner.nextFloat();

		System.out.print("Digite a segunda nota: ");
		float nota2 = scanner.nextFloat();

		System.out.print("Digite a terceira nota: ");
		float nota3 = scanner.nextFloat();

		System.out.print("Digite a quarta nota: ");
		float nota4 = scanner.nextFloat();

		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.printf("A media do aluno %s e: %.2f\n", nome, media);

		scanner.close();
	}
}