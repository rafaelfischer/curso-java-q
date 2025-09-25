/*
Objetivo do programa: Verificar Idade para Votar: Crie um algoritmo que receba a idade de uma pessoa e informe se ela já pode votar (idade igual ou superior a 16 anos).
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio12;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.close();
        
        if (idade >= 16) {
            System.out.println("Você já pode votar!");
        } 
        else {
            System.out.println("Você ainda não pode votar.");
        }
    }
}