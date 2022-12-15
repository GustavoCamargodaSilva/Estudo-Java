import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Exercicio 05//

        // PEÇA 1 //

        int cod_peca1, qtd_peca1;
        double valor_peca1;

        System.out.print("Digite o código da peça 01: ");
        cod_peca1 = sc.nextInt();

        System.out.print("Digite a quantidade desejada: ");
        qtd_peca1 = sc.nextInt();

        System.out.print("Digite o preço da peça: ");
        valor_peca1 = sc.nextDouble();

        double total_peca1 = qtd_peca1 * valor_peca1;

        // PEÇA 2 //

        int cod_peca2, qtd_peca2;
        double valor_peca2;

        System.out.print("Digite o código da peça 02: ");
        cod_peca2 = sc.nextInt();

        System.out.print("Digite a quantidade desejada: ");
        qtd_peca2 = sc.nextInt();

        System.out.print("Digite o preço da peça: ");
        valor_peca2 = sc.nextDouble();

        double total_peca2 = qtd_peca2 * valor_peca2;

        // ---------- //

        double total_pagar = total_peca1 + total_peca2;

        System.out.printf("TOTAL A PAGAR: %.2f%n", total_pagar);

        sc.close();
    }
}
