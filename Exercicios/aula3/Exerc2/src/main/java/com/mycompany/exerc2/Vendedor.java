
package com.mycompany.exerc2;

import javax.swing.JOptionPane;

public class Vendedor {
    private String nome;
    private double salarioBase;
    private double valorVendido;
    private double novoSalario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    public double getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }
    
    public void entrarNome() {
        setNome(JOptionPane.showInputDialog("Digite o nome do vendedor: "));
    }
    
    public void entrarSalarioBase() {
        setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario base: ")));
    }
    
    public void entrarValorVendido() {
        setValorVendido(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor vendido:")));
    }
    
    public double calculoComissao() {
        setNovoSalario(((getValorVendido() * 10) /100) + getSalarioBase());
        return getNovoSalario();
    }
    
}
