
package com.mycompany.projetoclienteooparret;


import javax.swing.JOptionPane;

public class Cliente {
    private String nome;
    private String rg;
    private String ende;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEnde() {
        return ende;
    }

    public void setEnde(String ende) {
        this.ende = ende;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void cadastrarCliente(String rg) {
        setNome(JOptionPane.showInputDialog("Digite o nome: "));
        // rg é o parâmetro que vem da classe Main
        setRg(rg);
        setEnde(JOptionPane.showInputDialog("Digite o endereço"));
        // Conversão para inteiro Integer.parseInt()
        // Conversão para números reais: Double.parseDouble()
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:")));
    }
    
    public String listarCliente() {
        return "Nome: " + getNome() + "\n" +
               "Endereço: " + getEnde() + "\n" +
               "RG: " + getRg() + "\n" +
               "Idade: " + getIdade()+ "\n";
    }
}
