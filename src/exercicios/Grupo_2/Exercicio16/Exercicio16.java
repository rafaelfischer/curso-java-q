/*
Objetivo do programa: Faixa Etária Simples: Peça a idade de uma pessoa e classifique-a como "Criança" (até 12 anos), "Adolescente" (13 a 17 anos) ou "Adulto" (18 anos ou mais).
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio16;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.close();
        
        if (idade <= 12) {
            System.out.println("Criança");
        } 
        else if (idade <= 17) {
            System.out.println("Adolescente");
        } 
        else {
            System.out.println("Adulto");
        }
    }
}