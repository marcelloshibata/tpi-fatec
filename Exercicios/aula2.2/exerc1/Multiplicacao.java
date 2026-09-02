import java.util.Scanner;

public class Multiplicacao {
    private int valor;
    private int resultado;

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public int getResultado() {
        return resultado;
    }
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int multiplicacao10() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número para ser multiplicado por 10: ");
        setValor(input.nextInt());
        input.close();

        setResultado(getValor() * 10);
        return getResultado();
    }

    public void mostrarMultiplicacao() {
        System.out.println("O resultado da multiplicação por 10 é " + getResultado());
    }
}
