
package com.mycompany.exerc4poopassagem;

public class Main {

    public static void main(String[] args) {
       Passageiro passageiro = new Passageiro();
       Passagem passagem = new Passagem();
       
       passageiro.cadastrarDadosPassageiro();
       passagem.cadastrarDadosPassagem();
       
       passageiro.mostrarDadosPassagem();
       passagem.mostrarDadosPassagem();
    }
}
