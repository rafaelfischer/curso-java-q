/*
Objetivo do programa: Classificação de Triângulos: Dados três valores que representam os lados de um triângulo, determine:
                    - Se eles formam um triângulo (a soma de dois lados deve ser sempre maior que o terceiro lado).
                    - Se for um triângulo, classifique-o como "Equilátero" (todos os lados iguais), "Isósceles" (dois lados iguais) ou "Escaleno" (todos os lados diferentes).
Data da criacao: 2025-09-25
Criado por: @rafaelfischer
*/
package Exercicios.Grupo_2.Exercicio31;
import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro lado do triângulo:");
        double lado1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo lado do triângulo:");
        double lado2 = scanner.nextDouble();
        
        System.out.println("Digite o terceiro lado do triângulo:");
        double lado3 = scanner.nextDouble();
        
        if (isTriangulo(lado1, lado2, lado3)) {
            String tipo = classificarTriangulo(lado1, lado2, lado3);
            System.out.println("É um triângulo " + tipo);
        } 
        else {
            System.out.println("Não forma um triângulo");
        }
        
        scanner.close();
    }
    
    private static boolean isTriangulo(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado1 + lado3 > lado2);
    }
    
    private static String classificarTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } 
        else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            return "Isósceles";
        } 
        else {
            return "Escaleno";
        }
    }
}
