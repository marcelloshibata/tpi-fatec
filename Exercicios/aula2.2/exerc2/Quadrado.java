import java.util.Scanner;

public class Quadrado {
    private double numero;
    private double resultado;

    public double getNumero() {
        return numero;
    }
    public void setNumero(double numero) {
        this.numero = numero;
    }
    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void calcularQuadrado() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número para elevar ao quadrado: ");
        setNumero(input.nextDouble());
        setResultado(Math.pow(getNumero(), 2));
        
        input.close();
    }

    public void mostrarQuadrado() {
        System.out.println("O valor de " + getNumero() + " ao quadrado é: " + getResultado());
    }
}
