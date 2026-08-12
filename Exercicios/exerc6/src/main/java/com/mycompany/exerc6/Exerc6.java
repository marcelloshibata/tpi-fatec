

package com.mycompany.exerc6;

import java.util.Scanner;

public class Exerc6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ladoA, ladoB, area, perimetro;
        
        System.out.println("Digite o valor do lado A: ");
        ladoA = scan.nextDouble();
        
        System.out.println("Digite o valor do lado B: ");
        ladoB = scan.nextDouble();
        
        area = ladoA * ladoB;
        perimetro = 2 * ladoA + 2 * ladoB;
        System.out.println("O valor da área é " + area + " e o valor do perimetro é " + perimetro);
    }
}
