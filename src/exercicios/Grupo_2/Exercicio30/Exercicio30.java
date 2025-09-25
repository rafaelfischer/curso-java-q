/*
Objetivo do programa: Aceitar Convite: Um convite será aceito se a pessoa for "amigo" OU for "familia" E estiver disponível. Peça o tipo de relação e a disponibilidade ("sim"/"não").
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio30;
import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual o tipo de relação? (amigo/familia)");
        String relacao = scanner.nextLine().toLowerCase();
        
        System.out.println("Está disponível? (sim/não)");
        String disponivel = scanner.nextLine().toLowerCase();
        scanner.close();
        
        boolean aceito = relacao.equals("amigo") || 
                       (relacao.equals("familia") && disponivel.equals("sim"));
        
        System.out.println(aceito ? "Convite aceito" : "Convite não aceito");
    }
}