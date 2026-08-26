
package com.mycompany.exerc6pooproduto;

import java.util.Scanner;

public class Produto {
    private String nomeProduto;
    private int quantidade;
    private double valor;
    private double total;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void cadastrarProduto(int quant) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome do produto: ");
        setNomeProduto(input.next());
        
        setQuantidade(quant);
        
        System.out.println("Digite o valor do produto: ");
        setValor(input.nextDouble());
    }
    
    public Double calcularTotal() {
        return getValor() * getQuantidade();
    }
}
