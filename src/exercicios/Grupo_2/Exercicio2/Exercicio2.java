/*
	Objetivo do programa: Pergunte um número. Diga se este numero é primo ou não, escrevendo na tela.
    Data da criacao: 2025-09-23
    Criado por: @rafaelfischer
*/

package Exercicios.Grupo_2.Exercicio2;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean primo = true;

        System.out.println("Eh um numero primo?");
        System.out.println("-----------------------");

        System.out.print("Digite um numero: ");
        numero = scanner.nextInt();

        // Por 2: Se o número for par (termina em 0, 2, 4, 6 ou 8), ele não é primo.
        // Por 3: Se a soma dos algarismos do número for divisível por 3, o número também é divisível por 3 e não é primo.
        // Por 5: Se o número terminar em 0 ou 5, ele não é primo.
        if (numero == 0) {
            primo = false;
        } 
        else if (numero == 2) {
            primo = false;
        } 
        else if (numero % 2 == 0 && numero != 2) {
            primo = false;
        } 
        else if (numero % 3 == 0 && numero != 3) {
            primo = false;
        } 
        else if (numero % 5 == 0 && numero != 5) {
            primo = false;
        }

        System.out.print("O numero " + numero + " eh primo?: ");
        if (primo) {
            System.out.print("Sim");
        } 
        else {
            System.out.print("Nao");
        }

        scanner.close();
    }
}
