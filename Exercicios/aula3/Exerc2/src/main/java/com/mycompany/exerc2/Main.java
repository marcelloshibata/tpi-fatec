
package com.mycompany.exerc2;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Vendedor vend = new Vendedor();
        
        int op;
        
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite \n 1 - Nome \n 2 - Salario Base \n 3 - Valor vendido \n 4 - Calcular Comissão \n 0 - Sair"));
            switch (op) {
                case 1:
                    vend.entrarNome();
                    break;
                case 2:
                    vend.entrarSalarioBase();
                    break;
                case 3:
                    vend.entrarValorVendido();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "O Vendedor " + vend.getNome() + " teve salário final de " + vend.calculoComissao());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando a aplicação.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida.");
                    break;
            }
        } while (op != 0);
    }
}
