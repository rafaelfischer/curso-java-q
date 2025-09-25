/*
Objetivo do programa: Pergunte uma letra (V, A, B). Diga a cor correspondente (Vermelho, Azul, Branco). Atenção, utilize a estrutura CASE.
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio11;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra (V, A ou B): ");
        String letra = scanner.nextLine().toUpperCase();
        scanner.close();

        switch (letra) {
            case "V":
                System.out.println("Vermelho");
                break;
            case "A":
                System.out.println("Azul");
                break;
            case "B":
                System.out.println("Branco");
                break;
            default:
                System.out.println("Letra inválida");
        }
    }
}