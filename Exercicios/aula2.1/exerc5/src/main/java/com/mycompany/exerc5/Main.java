
package com.mycompany.exerc5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produto prod = new Produto();
        
        System.out.println("Digite a quantidade do produto: ");
        int quant = input.nextInt();
        prod.cadastrarProduto(quant);
        System.out.println("O total é: " + prod.calcularTotal());
    }
}
