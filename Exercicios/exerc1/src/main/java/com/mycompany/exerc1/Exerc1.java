package com.mycompany.exerc1;

import java.util.Scanner;

public class Exerc1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salario, percentual, novoSalario;
        
        System.out.println("Digite o seu salário: ");
        salario = scan.nextDouble();
        
        System.out.println("Digite o percentual de reajuste: ");
        percentual = scan.nextDouble();
        
        novoSalario = salario + (salario * percentual / 100);
        System.out.println("O seu novo salário é " + novoSalario);
    }
}
