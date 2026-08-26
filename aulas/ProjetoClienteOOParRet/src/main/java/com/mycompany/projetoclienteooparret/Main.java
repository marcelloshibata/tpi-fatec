
package com.mycompany.projetoclienteooparret;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        // Instanciar objeto
        Cliente cli = new Cliente();
        
        // Lê o RG para passar por parâmetro
        String rg = JOptionPane.showInputDialog("Digite o RG: ");
        
        // Chama o método cadastrar passando o parâmetro RG
        cli.cadastrarCliente(rg);
        
        System.out.println(cli.listarCliente());
        JOptionPane.showMessageDialog(null, cli.listarCliente());
    }
}
