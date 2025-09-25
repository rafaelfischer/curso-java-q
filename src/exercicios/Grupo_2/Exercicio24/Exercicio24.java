
/*
Objetivo do programa: Ano Bissexto: Um ano é bissexto se for divisível por 400 OU se for divisível por 4 E não for divisível por 100. Peça um ano e verifique se ele é bissexto.
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio24;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        boolean ehBissexto = (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
        if (ehBissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } 
        else {
            System.out.println(ano + " não é um ano bissexto.");
        }
        scanner.close();
    }
}