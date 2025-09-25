/*
Objetivo do programa: Preço de Passagem Aérea: O preço da passagem aérea depende da classe (econômica, executiva) E se há promoção.
                        - Econômica: R$ 500 (normal), R$ 300 (promoção)
                        - Executiva: R$ 1500 (normal), R$ 1000 (promoção)
                        Peça a classe e se há promoção (""sim""/""não"") e informe o preço.
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio32;
import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a classe (economica/executiva):");
        String classe = scanner.nextLine().toLowerCase();
        
        System.out.println("Há promoção? (sim/nao):");
        String promocao = scanner.nextLine().toLowerCase();
        
        double preco = 0;
        
        if (classe.equals("economica")) {
            preco = promocao.equals("sim") ? 300 : 500;
        } else if (classe.equals("executiva")) {
            preco = promocao.equals("sim") ? 1000 : 1500;
        }
        
        System.out.printf("O preço da passagem é R$ %.2f", preco);
        scanner.close();
    }
}