/*
Objetivo do programa: Pergunte a nota de um aluno (de 0 a 10). Diga se o aluno está reprovado (nota < 5), em recuperação (nota entre 5 e 6.9) ou aprovado (nota ≥ 7)
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio8;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota do aluno (0 a 10): ");
        double nota = scanner.nextDouble();
        scanner.close();

        if (nota < 5) {
            System.out.println("Aluno reprovado");
        } 
        else if (nota < 7) {
            System.out.println("Aluno em recuperação");
        } 
        else {
            System.out.println("Aluno aprovado");
        }
    }
}