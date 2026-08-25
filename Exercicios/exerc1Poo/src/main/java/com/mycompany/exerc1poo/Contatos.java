
package com.mycompany.exerc1poo;

import java.util.Scanner;


public class Contatos {
    
    // declarando atributos
    private String nome;
    private String telefone;
    private String endereco;
    private String cidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    // métodos
    public void cadastrarDados() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        setNome(scan.next());
        
        System.out.println("Digite o endereço: ");
        setEndereco(scan.next());
        
        System.out.println("Digite o telefone: ");
        setTelefone(scan.next());
        
        System.out.println("Digite a cidade: ");
        setCidade(scan.next());
    }
    
    public void mostrarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Cidade: " + getCidade());
    }
}
