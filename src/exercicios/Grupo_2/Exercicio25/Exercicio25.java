/*
Objetivo do programa: Temperatura Ideal para Atividade: Para praticar um esporte ao ar livre, a temperatura deve estar entre 10°C E 30°C (inclusive). Peça a temperatura e informe se é "Ideal para o esporte" ou "Não ideal".
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio25;
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em °C: ");
        double temperatura = scanner.nextDouble();
        scanner.close();
        
        if (temperatura >= 10 && temperatura <= 30) {
            System.out.println("Ideal para o esporte");
        } 
        else {
            System.out.println("Não ideal");
        }
    }
}