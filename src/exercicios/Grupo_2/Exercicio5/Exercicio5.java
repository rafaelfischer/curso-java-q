/*
Objetivo do programa: Pergunte um número. Diga se esse número é positivo, negativo ou zero.
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio5;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        
        if (numero > 0) {
            System.out.println("O número é positivo");
        } 
        else if (numero < 0) {
            System.out.println("O número é negativo");
        } 
        else {
            System.out.println("O número é zero");
        }
        
        scanner.close();
    }
}