/*
	Objetivo do programa: Pergunte um número. Diga se este numero faz parte da tabuada do 3, escrevendo na tela.
    Data da criacao: 2025-09-23
    Criado por: @rafaelfischer
*/

package Exercicios.Grupo_2.Exercicio3;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercicio 3 - Tabuada do 3");
        System.out.println("-----------------------");

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero % 3 == 0) {
            System.out.print("O numero " + numero + " faz parte da tabuada do 3");
        } 
        else {
            System.out.print("O numero " + numero + " nao faz parte da tabuada do 3");
        }
    }
}