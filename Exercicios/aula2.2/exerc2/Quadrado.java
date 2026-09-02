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

    public double calcularQuadrado() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número para elevar ao quadrado: ");
        setNumero(input.nextDouble());
        input.close();
        setResultado(Math.pow(getNumero(), 2));
        
        return getResultado();
    }

    public void mostrarQuadrado() {
        System.out.printf("O valor de %.2f ao quadrado é igual a %.2f", getNumero(), calcularQuadrado());
    }
}
