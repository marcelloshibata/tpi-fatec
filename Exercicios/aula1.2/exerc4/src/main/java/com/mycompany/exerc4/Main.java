package com.mycompany.exerc4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ladoA, ladoB, area, perimetro;
        
        System.out.println("Digite o lado A: ");
        ladoA = input.nextDouble();
        
        System.out.println("Digite o lado B: ");
        ladoB = input.nextDouble();
        
        area = ladoA * ladoB;
        perimetro = (2 * ladoA) + (2 * ladoB);
        
        System.out.println("Área: " + area + "\n Perimetro: " + perimetro);
    }
}
