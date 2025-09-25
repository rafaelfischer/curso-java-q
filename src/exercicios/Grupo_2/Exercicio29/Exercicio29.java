/*
Objetivo do programa: Critério de Doação de Sangue: Uma pessoa pode doar sangue se tiver entre 18 E 69 anos E pesar no mínimo 50 kg. Peça idade e peso e informe se a pessoa pode doar.
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio29;
import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura (em °C): ");
        double temperatura = scanner.nextDouble();
        scanner.close();

        if (temperatura >= 10 && temperatura <= 30) {
            System.out.println("Ideal para o esporte");
        } 
        else {
            System.out.println("Não ideal");
        }
    }
}