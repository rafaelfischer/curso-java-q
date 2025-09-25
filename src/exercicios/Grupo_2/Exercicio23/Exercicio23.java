
/*
Objetivo do programa: Condição de Crédito: Um cliente pode obter crédito se tiver renda mensal acima de R$2000,00 OU se tiver um bom histórico de crédito (digite "bom" ou "ruim"). Informe se o crédito é "Aprovado" ou "Negado".
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio23;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua renda mensal: R$ ");
        double renda = scanner.nextDouble();
        
        System.out.print("Digite seu histórico de crédito (Bom / Ruim): ");
        String historico = scanner.next().toLowerCase();
        scanner.close();
        
        boolean creditoAprovado = renda > 2000 || historico.equals("bom");
        System.out.println("Crédito " + (creditoAprovado ? "Aprovado" : "Negado"));
    }
}