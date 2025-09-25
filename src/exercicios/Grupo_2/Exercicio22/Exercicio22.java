
/*
Objetivo do programa: Login com Credenciais: Crie um algoritmo que verifique se um nome de usuário (ex: "admin") E uma senha (ex: "1234") estão corretos para conceder acesso.
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio22;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adminUsuario = "admin";
        String adminSenha = "1234";

        System.out.print("Digite o usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        scanner.close();

        if (usuario.equals(adminUsuario) && senha.equals(adminSenha)) {
            System.out.println("Acesso concedido!");
        } 
        else {
            System.out.println("Acesso negado!");
        }

    }
}