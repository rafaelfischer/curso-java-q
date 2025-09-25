
/*
Objetivo do programa: Permissão para Dirigir: Uma pessoa pode dirigir se tiver 18 anos ou mais E possuir CNH. Peça a idade e se possui CNH (sim/não) e informe se a pessoa pode ou não dirigir.
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio21;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        
        // Menor de 18 anos
        if (idade < 18) {
            System.out.println("Você não pode dirigir");
            scanner.close();
            return;
        }

        // Tem 18 anos ou mais
        System.out.print("Possui CNH? (Sim/Não): ");
        String temCNH = scanner.nextLine().toLowerCase();
        scanner.close();
        
        // Validação da resposta
        if (!temCNH.equals("sim") && !temCNH.equals("s") && !temCNH.equals("não") && !temCNH.equals("nao") && !temCNH.equals("n")) {
            System.out.println("Resposta inválida. Por favor, responda com 'Sim' ou 'Não'.");
            return;
        }
        // Verifica se possui CNH
        else if (temCNH.equals("não") || temCNH.equals("nao") || temCNH.equals("n")) {
            System.out.println("Você não pode dirigir");
            return;
        }
        
        // Tem 18 anos ou mais E possui CNH   
        System.out.println("Você pode dirigir");
    }
}