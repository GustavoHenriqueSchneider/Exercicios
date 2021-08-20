import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[2];

        numero[0] = scanner.nextInt();
        numero[1] = scanner.nextInt();

        for (int i = numero[0] + 1; i < numero[1]; i++) {
            if (i % 2 == 1)
                System.out.println(i);
        }
    }

}
