
package com.mycompany.exerc3poodobro;

import java.util.Scanner;

public class Dobro {
    private double numero;
    private double calculo;

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }
    
    public void calcularDobro() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        setNumero(scan.nextDouble());
        
        setCalculo(getNumero() * 2);
        System.out.println("O dobro é: " + getCalculo());
    }
}
