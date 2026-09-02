package com.mycompany.exerc6;

import java.util.Scanner;


public class Loja {
    private String razaoSocial;
    private String cpfCliente;
    private double valorCompra;
    private int qtdItensComp;
    private double valorTotalCompra;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public int getQtdItensComp() {
        return qtdItensComp;
    }

    public void setQtdItensComp(int qtdItensComp) {
        this.qtdItensComp = qtdItensComp;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }
    
    public void inserirDadosLoja() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a razão social: ");
        setRazaoSocial(input.next());
        
        System.out.println("Digite o cpf do cliente: ");
        setCpfCliente(input.next());
        
        System.out.println("Digite o valor da compra: ");
        setValorCompra(input.nextDouble());
        
        System.out.println("Digite a quantidade da compra: ");
        setQtdItensComp(input.nextInt());
    }
    
    public double calcularCompraLoja() {
        setValorTotalCompra(getValorCompra() * getQtdItensComp());
        return getValorTotalCompra();
    }
    
    public String mostrarDadosLoja() {
        return "Razão social: " + getRazaoSocial() + "\n" +
                "Cpf cliente: " + getCpfCliente() + "\n" +
                "Valor compra: " + getValorCompra()+ "\n" +
                "Quantidade de itens: " + getQtdItensComp()+ "\n" +
                "Valor total da compra: " + calcularCompraLoja() + "\n";
    }
}
