/*
	Objetivo do programa: Pergunte a data de nascimento e verifique se a data atual é a data de aniversário.
                            Se for, printe a mensagem de Feliz Aniversário, senão printe a mensagem hoje e dia X de Y
                            de ZZZZ.
    Data da criacao: 2025-09-23
    Criado por: @rafaelfischer
*/

package Exercicios.Grupo_2.Exercicio4;
import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a data de nascimentoimento
        System.out.print("Digite o dia do seu nascimento: ");
        int diaNascimento = scanner.nextInt();

        System.out.print("Digite o mes do seu nascimento: ");
        int mesNascimento = scanner.nextInt();

        // Obtém a data atual
        LocalDate hoje = LocalDate.now();
        int diaAtual = hoje.getDayOfMonth();
        int mesAtual = hoje.getMonthValue();
        int anoAtual = hoje.getYear();

        // Verifica se é aniversário
        if (diaNascimento == diaAtual && mesNascimento == mesAtual) {
            System.out.println("Feliz Aniversário!");
        } 
        else {
            System.out.printf("Hoje eh dia %d de %d de %d%n", diaAtual, mesAtual, anoAtual);
        }

        scanner.close();
    }
}