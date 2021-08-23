import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        double[] peso = new double[150];
        int index = 0;
        double menorPeso;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < peso.length; i++) {
            System.out.println("Informe o peso para o usuario " + (i + 1) + " (posição " + i + " do vetor):");
            peso[i] = scanner.nextDouble();
        }

        menorPeso = peso[0];

        for (int i = 0; i < peso.length; i++) {
            if (peso[i] < menorPeso) {
                menorPeso = peso[i];
                index = i;
            }
        }

        System.out.println("\nO menor peso se encontra na posição " + index + " do vetor");
    }
}
