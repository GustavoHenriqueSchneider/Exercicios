import java.util.Scanner;
import java.lang.Math;

public class Exercicio7 {

    public static void main(String[] args) {
        int[] numero = {0, 0, 0};
        char[] letras = {'A', 'B', 'C'};
        double[] raiz = {0, 0};
        int status = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Sendo uma equação de segundo grau: A.X²+B.X+C=0");

        for (int i = 0; i < 3; i++) {
            do {
                System.out.println("Insira o valor para " + letras[i] + ": ");
                numero[i] = scan.nextInt();
            } while (numero[0] == 0);
        }

        int delta = (int) Math.pow(numero[1], 2) - 4 * numero[0] * numero[2];

        if (delta > 0) {
            raiz[0] = (-numero[1] + Math.sqrt(delta)) / (2 * numero[0]);
            raiz[1] = (-numero[1] - Math.sqrt(delta)) / (2 * numero[0]);
            status = 2;
        } else if (delta == 0) {
            raiz[0] = (-numero[1] + Math.sqrt(delta)) / (2 * numero[0]);
            status = 1;
        }

        System.out.printf("\nStatus: %d", status);
        System.out.printf("\nPrimeira raiz real: %.2f", raiz[0]);
        System.out.printf("\nSegunda raiz real: %.2f", raiz[1]);


    }
}
