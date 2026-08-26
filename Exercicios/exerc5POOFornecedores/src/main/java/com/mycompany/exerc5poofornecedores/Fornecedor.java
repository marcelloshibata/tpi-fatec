
package com.mycompany.exerc5poofornecedores;

import java.util.Scanner;


public class Fornecedor {
    private String nomeFornecedor;
    private String nomeProduto;
    private String descricaoProduto;

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    
    public void cadastrarFornecedor(String nomeProduto) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        setNomeFornecedor(input.next());
        
        setNomeProduto(nomeProduto);
        
        System.out.println("Digite a descrição do produto: ");
        setDescricaoProduto(input.next());
    }
    
    public String listarFornecedor() {
        return "Nome fornecedor: " + getNomeFornecedor() + "\n" +
                "Nome Produto: " + getNomeProduto()+ "\n" +
                "Descrição do produto: " + getDescricaoProduto() + "\n";
    }
}
