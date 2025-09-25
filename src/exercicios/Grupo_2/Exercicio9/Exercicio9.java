/*
Objetivo do programa: Pergunte o número do mês (1 a 12). Diga quantos dias ele tem (ano não bissexto). Atenção, utilize a estrutura CASE.
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio9;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do mês (1-12): ");
        int mes = scanner.nextInt();
        int dias;
        
        switch (mes) {
            case 2:
                dias = 28;
                break;
            case 4, 6, 9, 11:
                dias = 30;
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                dias = 31;
                break;
            default:
                System.out.println("Mês inválido!");
                scanner.close();
                return;
        }
        System.out.println("O mês " + mes + " tem " + dias + " dias.");
        scanner.close();
    }
}