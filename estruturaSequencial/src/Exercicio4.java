import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Exercicio 4//

        System.out.print("Digite o seu código: ");
        int cod_funcionario = sc.nextInt();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        int qtd_horas = sc.nextInt();

        System.out.print("Digite o valor da hora trabalhada: ");
        double valor_hora = sc.nextDouble();

        double salario = qtd_horas * valor_hora;

        System.out.println("ID funcionário: " + cod_funcionario);
        System.out.printf("Salario: U$ %.2f%n ", salario);

        sc.close();
    }
}
