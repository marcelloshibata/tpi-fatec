import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        // Declaração de variável
        double soma, num1, num2, sub, mult, div;

        // Comando para leitura de dados pelo teclado
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = leia.nextDouble();

        System.out.print("Digite outro número: ");
        num2 = leia.nextDouble();

        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;

        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da subtração é: " + sub);
        System.out.println("O resultado da multiplicação é: " + mult);
        System.out.println("O resultado da divisão é: " + div);
        leia.close();
    }
}
