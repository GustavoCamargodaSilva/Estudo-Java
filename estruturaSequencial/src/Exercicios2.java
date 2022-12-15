import java.util.Locale;
import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Exercicio 02 //

        double pi = 3.14159, area, raio;

        raio = sc.nextDouble();

        area = pi * raio * raio;

        System.out.printf("Area= %.4f%n", area);

        sc.close();

        // Entrada = 2.00 resultado = 12.5664
        // Entrada = 100.64 resultado = 31819.3103
        // Entrada = 150.00 resultado = 70685.7750

    }
}
