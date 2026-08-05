import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int idade, dias;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        idade = scan.nextInt();
        dias = idade * 365;

        System.out.println("Sua idade em dias é: " + dias);
        scan.close();
    }
}
