/*
Objetivo do programa: Dia da Semana: Peça um número de 1 a 7 e imprima o nome do dia da semana correspondente (1 para Domingo, 2 para Segunda, etc.). Se o número for inválido, informe.
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio18;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 7: ");
        int numero = scanner.nextInt();
        scanner.close();

        switch (numero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido! Digite um número entre 1 e 7.");
        }
    }
}