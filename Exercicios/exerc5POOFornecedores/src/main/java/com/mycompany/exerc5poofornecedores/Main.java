
package com.mycompany.exerc5poofornecedores;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fornecedor forn = new Fornecedor();
        
        System.out.println("Digite o nome do produto: ");
        String nomeProduto = input.next();
        forn.cadastrarFornecedor(nomeProduto);
        
        System.out.println(forn.listarFornecedor());
    }
}
