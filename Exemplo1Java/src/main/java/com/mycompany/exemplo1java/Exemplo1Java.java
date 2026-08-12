package com.mycompany.exemplo1java;

import java.util.Scanner;

public class Exemplo1Java {
    public static void main(String[] args) {
        // COMANDO PARA DAR ENTRADA DE DADOS
        Scanner scan = new Scanner(System.in);
        
        // DECLARAÇÃO DE VARIÁVEIS
        double nota1, nota2, media;
        String aluno;
        
        // COMANDO PARA MOSTRAR MENSAGEM
        System.out.println("Digite o nome do aluno: ");
        aluno = scan.next();
        
        System.out.println("Digite a primeira nota: ");
        nota1 = scan.nextDouble();
        
        System.out.println("Digite a segunda nota");
        nota2 = scan.nextDouble();
        
        media = (nota1 + nota2)/2;
        System.out.println("A média do aluno " + aluno + " é " + media);
    }
}
