
package com.mycompany.projetocalculadora_oo;

import javax.swing.JOptionPane;


public class Calculadora {
    private double num1;
    private double num2;
    private double resul;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResul() {
        return resul;
    }

    public void setResul(double resul) {
        this.resul = resul;
    }
    
    // Método sem parâmetro e sem retorno
    public void somar() {
        setNum1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: ")));
        setNum2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: ")));
        setResul(getNum1() + getNum2());
        JOptionPane.showMessageDialog(null, "O valor da soma é: " + getResul());
    }
    
    // Método com parâmetro e sem retorno
    public void subtrair(double a, double b) {
        setResul(a - b);
        JOptionPane.showMessageDialog(null, "O valor da subtração é: " + getResul());
    }
    
    // Método com retorno e sem parâmetro
    public double multiplicar() {
        setNum1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: ")));
        setNum2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: ")));
        setResul(getNum1() * getNum2());
        return getResul();
    }
    
    // Método com retorno e com parâmetro
    public double dividir(double a, double b) {
        setResul(a / b);
        return getResul();
    }
}
