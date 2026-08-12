package com.mycompany.exerc4;

import java.util.Scanner;


public class Exerc4 {

    public static void main(String[] args) {
        // Declarar scanner faz entrada de dados
        Scanner scan = new Scanner(System.in);
        double qtd, salarioMin, salarioFunc;
        
        System.out.println("Digite o salário mínimo: ");
        salarioMin = scan.nextDouble();
        
        System.out.println("Digite o salário do funcionário: ");
        salarioFunc = scan.nextDouble();
        
        qtd = salarioFunc/salarioMin;
        
        System.out.println("A quantidade de salários mínimos é " + qtd);
        
        // Para formatar e mostrar 2 números depois da vírgula.
        System.out.printf("A quantidade de salario é %.2f", qtd);
    }
}
