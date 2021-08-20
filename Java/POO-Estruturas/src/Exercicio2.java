import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSalario = 0, totalSalarioReajustado = 0;
        System.out.println("Insira seu nome: ");
        String nome = scanner.nextLine();

        do {
            double salarioReajustado;

            System.out.println("Insira seu salario: ");
            double salario = scanner.nextDouble();

            totalSalario += salario;

            if (salario < 150)
                salarioReajustado = salario * 1.25;
            else if (salario >= 150 && salario < 300)
                salarioReajustado = salario * 1.2;
            else if (salario >= 300 && salario < 600)
                salarioReajustado = salario * 1.15;
            else
                salarioReajustado = salario * 1.1;

            totalSalarioReajustado += salarioReajustado;

            System.out.printf("\nNome: %s\nSalario: R$%.2f\nSalario reajustado: R$%.2f\n\n", nome, salario, salarioReajustado);

            System.out.println("Deseja repetir o calculo? Insira seu nome abaixo para continuar ou 'FIM' para encerrar: ");
            scanner.nextLine();
            nome = scanner.nextLine();

        } while (!"FIM".equals(nome));

        System.out.printf("\nSoma total dos salarios: R$%.2f\nSoma total dos salarios reajustados: R$%.2f\nDiferença: R$%.2f", totalSalario, totalSalarioReajustado, (totalSalarioReajustado - totalSalario));
    }
}
