import java.util.Locale;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Exercicio 01 //

        int a = 10;
        int b = 30;
        System.out.println(a + b);

        int c = -30;
        int d = 10;
        System.out.println(c + d);

        sc.close();
    }
}
