/*
Objetivo do programa: Cálculo de Bônus: Um funcionário recebe bônus se atingir uma meta de vendas (vendas >= 10000) OU se tiver mais de 5 anos de empresa. Se ambas as condições forem verdadeiras, o bônus é dobrado. Peça as vendas e os anos de empresa, e calcule o bônus (bônus base R$500).
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio34;
import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bonus = 500.0;
        
        System.out.print("Digite o valor das vendas: ");
        double vendas = scanner.nextDouble();
        
        System.out.print("Digite os anos de empresa: ");
        int anosEmpresa = scanner.nextInt();
        scanner.close();
        
        boolean metaVendas = vendas >= 10000;
        boolean tempoEmpresa = anosEmpresa > 5;
        
        if (metaVendas && tempoEmpresa) {
            bonus *= 2;
        } 
        else {
            bonus = 0;
        }
        
        System.out.printf("O bônus do funcionário é R$ %.2f%n", bonus);
    }
}