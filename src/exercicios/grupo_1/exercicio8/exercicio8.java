/*
  	Objetivo do programa: 	Você está montando um cadastro para uma empresa de vendas na internet, e precisa fornecer este "formulário de dados de clientes". 
						  	Não se preocupe neste momento se irá ou não guardar este dado em algum lugar. 
							Pergunte e obtenha os seguintes dados e depois exiba todos na tela:
								- Nome Completo
								- Data de Nascimento
								- Cidade/Pais de Origem(Nascimento)
								- Endereco completo de onde mora
								- Pais onde reside
								- Data do Cadastro
								- Escolaridade: (Ensino Básico/Ensino Fundamental/Ensino Superior) 
	Data da criacao: 2025-08-28
	Criado por: @programacaomentoria
	Ultima atualizacao: 2025-09-15
	Alterado por: @rafaelfischer
*/

package Exercicios.Grupo_1.Exercicio8;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Exercicio 8 - Cadastro de Clientes");
		System.out.println("-------------------");

		System.out.print("Nome Completo: ");
		String nomeCompleto = scanner.nextLine();

		System.out.print("Data de Nascimento: ");
		String dataNascimento = scanner.nextLine();

		System.out.print("Cidade/Pais de Origem (Nascimento): ");
		String cidadePaisOrigem = scanner.nextLine();

		System.out.print("Endereco completo de onde mora: ");
		String enderecoCompleto = scanner.nextLine();

		System.out.print("Pais onde reside: ");
		String paisResidencia = scanner.nextLine();

		System.out.print("Data do Cadastro: ");
		String dataCadastro = scanner.nextLine();

		System.out.print("Escolaridade (Ensino Básico/Ensino Fundamental/Ensino Superior): ");
		String escolaridade = scanner.nextLine();

		System.out.println("\n============================");
		System.out.println("Dados do Cliente Cadastrado:");
		System.out.println("============================");
		System.out.println("Nome Completo: " + nomeCompleto);
		System.out.println("Data de Nascimento: " + dataNascimento);
		System.out.println("Cidade/Pais de Origem: " + cidadePaisOrigem);
		System.out.println("Endereco Completo: " + enderecoCompleto);
		System.out.println("Pais de Residencia: " + paisResidencia);
		System.out.println("Data do Cadastro: " + dataCadastro);
		System.out.println("Escolaridade: " + escolaridade);

		scanner.close();
	}
}