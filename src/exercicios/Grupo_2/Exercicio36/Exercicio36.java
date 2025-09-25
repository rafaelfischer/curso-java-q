/*
Objetivo do programa: Pergunte o valor de uma compra. Se for maior que R$ 100, aplique 10% de desconto. Caso contrário, não aplique desconto. Atenção, utilize a estrutura IF.
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio36;
import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra: R$ ");
        double totalDesconto = 10;
        double valor = scanner.nextDouble();
        scanner.close();
        
        if (valor > 100) {
            double desconto = valor * (totalDesconto / 100);
            System.out.print("Valor com desconto de "+ String.format("%.0f", totalDesconto) +"%: "+ String.format("R$ %.2f", (valor - totalDesconto)) +" - Valor do desconto: "+ String.format("R$ %.2f%n", desconto));
        } 
        else {
            System.out.printf("Valor sem desconto: R$ %.2f%n", valor);
        }
        
    }
}