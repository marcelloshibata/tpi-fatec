
package com.mycompany.exerc3;

import java.util.Scanner;

public class Passagem {
    private String localViagem;
    private String data;
    private String horario;
    private String numpoltrona;

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horário) {
        this.horario = horário;
    }

    public String getNumpoltrona() {
        return numpoltrona;
    }

    public void setNumpoltrona(String numpoltrona) {
        this.numpoltrona = numpoltrona;
    }
    
    public void cadastrarDadosPassagem() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o local da viagem: ");
        setLocalViagem(input.next());
        
        System.out.println("Digite a data: ");
        setData(input.next());
        
        System.out.println("Digite o horario: ");
        setHorario(input.next());
        
        System.out.println("Digite o numero da poltrona: ");
        setNumpoltrona(input.next());
    }
    
    public void mostrarDadosPassagem() {
        System.out.println("Local viagem: " + getLocalViagem() + "\n" +
                            "Data: " + getData() + "\n" +
                            "Horário: " + getHorario()+ "\n" +
                            "Numero da poltrona " + getNumpoltrona()+ "\n");
    }
}
