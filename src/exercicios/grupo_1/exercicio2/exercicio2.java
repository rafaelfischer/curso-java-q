/*
	Objetivo do programa: Perguntar o nome de quem está usando o programa e sua idade. Faça duas perguntas.
	Data da criacao: 2025-08-28
	Criado por: @programacaomentoria
	Ultima atualizacao: 2025-09-16
	Alterado por: @rafaelfischer
*/

package exercicios.grupo_1.exercicio2;
import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();

		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();

		System.out.println("Ola, " + nome + "! Voce tem " + idade + " anos.");

		scanner.close();
	}
}