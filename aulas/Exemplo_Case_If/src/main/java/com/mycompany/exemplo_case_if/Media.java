
package com.mycompany.exemplo_case_if;

import javax.swing.JOptionPane;


public class Media {
    private String nome;
    private double nota1;
    private double nota2;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    public void inserirNotas() {
        setNome(JOptionPane.showInputDialog("Nome Aluno:"));
        setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1:")));
        setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2:")));
    }
    
    public double calcularMedia() {
        setMedia((getNota1() + getNota2()) / 2);
        return getMedia();
    }
    
    public void verificarSituacao() {
        if (getMedia() < 4) {
            JOptionPane.showMessageDialog(null, 
                    getNome() + " está reprovado, a média é " + getMedia());
        } else if ((getMedia() == 4) || (getMedia() <= 5)) {
            JOptionPane.showMessageDialog(null, 
                    getNome() + " está de exame, a média é " + getMedia());
        } else if ((getMedia() > 5) && (getMedia() <= 10)) {
            JOptionPane.showMessageDialog(null, 
                    getNome() + " está aprovado, a média é " + getMedia());
        }
    }
}
