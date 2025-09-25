/*
Objetivo do programa: Número no Intervalo: Verifique se um número inteiro fornecido pelo usuário está entre 1 e 10 (1 e 10 não são contados).
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio27;
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        scanner.close();
        
        if (numero > 1 && numero < 10) {
            System.out.println("O número está entre 1 e 10.");
        } 
        else {
            System.out.println("O número não está entre 1 e 10.");
        }   
    }
}