/*
Objetivo do programa: Decisão de Compra Online: Um usuário decide comprar um item online se o preço for menor que R$100 OU se o frete for grátis E o estoque for maior que zero. Peça o preço, se o frete é grátis ("sim"/"não") e a quantidade em estoque, e informe se o usuário irá "Comprar" ou "Não comprar".
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio35;
import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o preço do item: R$ ");
        double preco = scanner.nextDouble();
        
        System.out.print("O frete é grátis? (sim/não): ");
        String freteGratis = scanner.next().toLowerCase();
        
        System.out.print("Digite a quantidade em estoque: ");
        int estoque = scanner.nextInt();
        scanner.close();
        
        boolean deveComprar = preco < 100 || (freteGratis.equals("sim") && estoque > 0);
        System.out.println(deveComprar ? "Comprar" : "Não comprar");
    }
}