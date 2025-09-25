/*
Objetivo do programa: Validação de Data: Crie um algoritmo que verifique se uma data (dia, mês, ano) é válida. Considere meses com 30, 31 dias e fevereiro (29 em ano bissexto, 28 nos outros). Não precisa validar anos negativos ou meses fora de 1-12.
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio33;
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();
        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();
        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();
        scanner.close();
        
        boolean dataValida = validarData(dia, mes, ano);
        System.out.println("Data " + (dataValida ? "válida" : "inválida"));
        
    }
    
    private static boolean validarData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12 || dia < 1) 
            return false;
        
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};        
        if (mes == 2 && ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0)) {
            diasPorMes[2] = 29;
        }
        
        return dia <= diasPorMes[mes];
    }
}