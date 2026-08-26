
package com.mycompany.exerc2poocliente;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private String end;
    private String rg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public void cadastrarCliente(String rg) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        setNome(scan.next());
        
        System.out.println("Digite o endereço: ");
        setEnd(scan.next());
        
        System.out.println("Digite o RG: ");
        setRg(scan.next());
    }
    
    public void listarCliente() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEnd());
        System.out.println("RG: " + getRg());
    }
}
