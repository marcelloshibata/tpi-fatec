
package com.mycompany.exerc5;

import java.util.Scanner;

public class Exerc5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int quant;
        double precoUnit, total;
        
        System.out.println("Digite o nome do produto: ");
        nome = scan.next();
        
        System.out.println("Digite a quantidade comprada: ");
        quant = scan.nextInt();
        
        System.out.println("Digite o preço unitário: ");
        precoUnit = scan.nextDouble();
        
        total = quant * precoUnit;
        System.out.printf("O valor total a ser pago de " + nome + " é %.2f", total);
    }
}