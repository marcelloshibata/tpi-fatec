
package com.mycompany.exerc3;

import java.util.Scanner;


public class Passageiro {
    private String nomePassageiro;
    private String telefone;
    private String rg;

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public void cadastrarDadosPassageiro() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        setNomePassageiro(input.next());
        
        System.out.println("Digite o RG: ");
        setRg(input.next());
        
        System.out.println("Digite o telefone: ");
        setTelefone(input.next());
    }
    
    public void mostrarDadosPassagem() {
        System.out.println("Passageiro: " + getNomePassageiro()+ "\n" +
                            "RG: " + getRg()+ "\n" +
                            "Telefone: " + getTelefone()+ "\n");
    }
}
