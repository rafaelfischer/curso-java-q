/*
Objetivo do programa: Exclusão de Desconto: Um desconto de 15% é aplicado, EXCETO se o produto for da categoria "Eletrônicos" E o valor for inferior a R$500. Peça a categoria e o valor, e diga se o desconto se aplica. (Use NÃO ou negue a condição do E)
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio28;
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a categoria do produto: ");
        String categoria = scanner.nextLine();
        
        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();
        scanner.close();
        
        boolean aplicaDesconto = !(categoria.equalsIgnoreCase("Eletronicos") && valor < 500);
        
        if (aplicaDesconto) {
            System.out.println("O desconto de 15% será aplicado.");
        } 
        else {
            System.out.println("O desconto não será aplicado.");
        }
    }
}