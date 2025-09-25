/*
Objetivo do programa: Acesso ao Sistema: Um sistema requer que a senha tenha no mínimo 6 caracteres. Peça uma senha e informe se ela é "Válida" ou "Inválida".
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio20;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma senha: ");
        String senha = scanner.nextLine();
        scanner.close();
        
        if (senha.length() >= 6) {
            System.out.println("Válida");
        } 
        else {
            System.out.println("Inválida");
        }
    }
}