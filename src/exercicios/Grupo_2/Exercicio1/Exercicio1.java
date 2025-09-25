/*
	Objetivo do programa: Pergunte um número. Diga se este numero é par ou ímpar, escrevendo na tela.
    Data da criacao: 2025-09-23
    Criado por: @rafaelfischer
*/

package Exercicios.Grupo_2.Exercicio1;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Par ou Impar");
        System.out.println("-----------------------");

        System.out.print("Digite um numero: ");
        numero = scanner.nextInt();
        scanner.close();

        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " eh par.");
        } 
        else {
            System.out.println("O numero " + numero + " eh impar.");
        }
    }
}