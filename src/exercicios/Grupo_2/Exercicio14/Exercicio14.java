/*
Objetivo do programa: Média de Aprovação: Um aluno é aprovado se sua média final for igual ou superior a 7. Peça a nota do aluno e informe se ele foi "Aprovado" ou "Reprovado".
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio14;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();
        scanner.close();
        
        if (nota >= 7.0) {
            System.out.println("Aprovado");
        } 
        else {
            System.out.println("Reprovado");
        }
    }
}