/*
Objetivo do programa: Pergunte a idade de uma pessoa. Diga se essa pessoa é uma criança (até 12 anos), um adolescente (13 a 17 anos), uma adulta (18 a 59 anos) ou idosa (60 anos ou mais)
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio6;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade <= 12) {
            System.out.println("Criança");
        } 
        else if (idade <= 17) {
            System.out.println("Adolescente");
        } 
        else if (idade <= 59) {
            System.out.println("Adulto");
        } 
        else {
            System.out.println("Idoso");
        }

        scanner.close();
    }
}