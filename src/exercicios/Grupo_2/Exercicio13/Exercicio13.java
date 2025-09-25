/*
Objetivo do programa: Sinal do Número: Desenvolva um algoritmo que solicite um número e diga se ele é positivo, negativo ou zero.
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio13;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        scanner.close();
        
        if (numero > 0) {
            System.out.println("O número é positivo");
        } 
        else if (numero < 0) {
            System.out.println("O número é negativo");
        } 
        else {
            System.out.println("O número é zero");
        }
    }
}