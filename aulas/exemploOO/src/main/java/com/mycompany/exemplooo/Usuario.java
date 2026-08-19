
package com.mycompany.exemplooo;

import java.util.Scanner;

public class Usuario {
    private String nome;
    private int idade;
    private String email;
    private String telefone;

    // Encapsulamento dos atributo

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    // Criar método mostrar dados
    public void mostrarDados() {
        System.out.println("=== Dados Usuário ===");
        System.out.println("Nome Usuário: " + getNome() + "\n" +
                "E-mail: " + getEmail() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Telefone: " + getTelefone());
    }
    
    // Criar método cadastrar dados
    public void cadastrarDados() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        setNome(scan.next());
        
        System.out.println("Digite a idade: ");
        setIdade(scan.nextInt());
        
        System.out.println("Digite o e-mail: ");
        setEmail(scan.next());
        
        System.out.println("Digite o telefone: ");
        setTelefone(scan.next());
    }
    
}
