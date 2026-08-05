import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, nota5, nota6,
        media1, media2, soma;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = scan.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = scan.nextDouble();
        media1 = (nota1 + nota2 + nota3) / 3;

        System.out.println("Digite a quarta nota: ");
        nota4 = scan.nextDouble();

        System.out.println("Digite a quinta nota: ");
        nota5 = scan.nextDouble();

        System.out.println("Digite a sexta nota: ");
        nota6 = scan.nextDouble();
        media2 = (nota4 + nota5 + nota6) / 3;
        
        soma = media1 + media2;
        System.out.println("A média 1 é igual a: " + media1);
        System.out.println("A média 2 é igual a: " + media2);
        System.out.println("A soma entre as médias é: " + soma);
        scan.close();
    }
}
