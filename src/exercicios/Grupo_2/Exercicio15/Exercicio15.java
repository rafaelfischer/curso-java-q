/*
Objetivo do programa: Maior de Dois Números: Dados dois números inteiros, determine qual deles é o maior ou se são iguais.
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio15;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        scanner.close();
        
        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } 
        else if (num2 > num1) {
            System.out.println(num2 + " é maior que " + num1);
        } 
        else {
            System.out.println("Os números são iguais");
        }
    }
}