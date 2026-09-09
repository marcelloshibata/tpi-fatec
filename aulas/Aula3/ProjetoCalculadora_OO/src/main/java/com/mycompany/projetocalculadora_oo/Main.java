
package com.mycompany.projetocalculadora_oo;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        // Instanciar o objeto
        Calculadora calc = new Calculadora();
        
        int op;
        double a,b;
        
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n 1 - Somar \n 2 - Subtrair \n 3 - Multiplicar \n 4 - Dividir \n 0 - Sair"));
            switch (op) {
                case 1:
                    calc.somar();
                    break;
                case 2:
                    a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
                    b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
                    calc.subtrair(a, b);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "O valor da multiplicação é: " + calc.multiplicar());
                    break;
                case 4:
                    a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
                    b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
                    JOptionPane.showMessageDialog(null, "O valor da divisão é: " + calc.dividir(a, b));
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção incorreta.");
                    break;
            }
        } while(op != 0);
    }
}
