/*
Objetivo do programa: Verificar Vogal: Peça um caractere e verifique se ele é uma vogal (a, e, i, o, u), considerando letras maiúsculas e minúsculas. Use o operador OU.
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio26;
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um caractere: ");
        char letra = scanner.next().charAt(0);
        scanner.close();
        
        boolean ehVogal = letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                         letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U';
        
        if (ehVogal) {
            System.out.println("O caractere é uma vogal");
        } 
        else {
            System.out.println("O caractere não é uma vogal");
        }
    }
}