package com.mycompany.exerc6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeProd1, nomeProd2, nomeProd3;
        int quant1, quant2, quant3;
        double valor1, valor2, valor3, valorProd1, valorProd2, valorProd3, valorTotal;
        
        System.out.println("Nome produto 1: ");
        nomeProd1 = input.next();
        System.out.println("Nome produto 2: ");
        nomeProd2 = input.next();
        System.out.println("Nome produto 3: ");
        nomeProd3 = input.next();
        
        System.out.println("Quantidade produto 1: ");
        quant1 = input.nextInt();
        System.out.println("Quantidade produto 2: ");
        quant2 = input.nextInt();
        System.out.println("Quantidade produto 3: ");
        quant3 = input.nextInt();
        
        System.out.println("Valor produto 1: ");
        valor1 = input.nextDouble();
        System.out.println("Valor produto 2: ");
        valor2 = input.nextDouble();
        System.out.println("Valor produto 3: ");
        valor3 = input.nextDouble();
        
        valorProd1 = valor1 * quant1;
        valorProd2 = valor2 * quant2;
        valorProd3 = valor3 * quant3;
        
        valorTotal = valorProd1 + valorProd2 + valorProd3;
        System.out.println("Produto: " + nomeProd1 + " - Valor Total: R$ " + valorProd1);
        System.out.println("Produto: " + nomeProd2 + " - Valor Total: R$ " + valorProd2);
        System.out.println("Produto: " + nomeProd3 + " - Valor Total: R$ " + valorProd3);

        System.out.println("Valor Total Geral: R$ " + valorTotal);
    }
}
