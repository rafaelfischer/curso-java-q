/*
Objetivo do programa: Desconto por Compra: Uma loja oferece 10% de desconto se o valor da compra for superior a R$100,00. Leia o valor da compra e mostre o valor final com ou sem desconto.
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio17;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();
        double desconto = 10; // porcentagem de desconto
        scanner.close();
        
        if (valorCompra > 100.0) {
            double valorDesconto = valorCompra * (desconto / 100);   // calcula 10% de desconto
            System.out.println("Valor com desconto de "+ String.format("%.0f", desconto) +"%: " + String.format("R$ %.2f", (valorCompra - valorDesconto)) + 
                             " - Valor do desconto: " + String.format("R$ %.2f", valorDesconto));
        } 
        else {
            System.out.println("Valor sem desconto: " + String.format("R$ %.2f", valorCompra));
        }
    }
}