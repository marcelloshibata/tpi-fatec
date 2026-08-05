import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salarioMinimo, salarioUser, quant;

        System.out.println("Digite o valor do salário mínimo: ");
        salarioMinimo = scan.nextDouble();

        System.out.println("Digite o seu salário: ");
        salarioUser = scan.nextDouble();

        quant = salarioUser / salarioMinimo;
        System.out.println("A quantidade de salários mínimos é: " + quant);
        scan.close();
    }
}
