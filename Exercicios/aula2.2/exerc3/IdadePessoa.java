import java.util.Scanner;

public class IdadePessoa {
    private int anoAtual;
    private int ano;
    private int idade;

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void calcularIdade() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o ano atual: ");
        setAnoAtual(input.nextInt());

        System.out.println("Digite o ano de nascimento: ");
        setAno(input.nextInt());

        setIdade((anoAtual - ano));
        input.close();
    }

    public void mostrarIdade() {
        System.out.println("A idade é " + getIdade() + " anos");
    }
}