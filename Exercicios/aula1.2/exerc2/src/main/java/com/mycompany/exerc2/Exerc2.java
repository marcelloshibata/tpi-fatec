package com.mycompany.exerc2;

import java.util.Scanner;

public class Exerc2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int litros;
        double resultado;
        
        System.out.println("Digite quantos litros você quer abastecer: ");
        litros = scan.nextInt();
        
        resultado = litros * 6.49;
        System.out.println("Você irá pagar R$" + resultado);
    }
}
