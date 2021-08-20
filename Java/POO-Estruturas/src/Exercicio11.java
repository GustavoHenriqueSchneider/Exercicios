import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        int qntFuncionarios, salariosAcimaMedia = 0;
        double totalSalarios = 0;
        double media;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Insira a quantidade de funcionarios: ");
            qntFuncionarios = scanner.nextInt();
        } while (qntFuncionarios == 0);

        double[] salarios = new double[qntFuncionarios];

        for (int i=0;i<salarios.length;i++) {
            System.out.println("Insira o salario: ");
            salarios[i] = scanner.nextDouble();
            totalSalarios += salarios[i];
        }

        media = totalSalarios / qntFuncionarios;

        for (double salario : salarios) {
            if (salario > media)
                salariosAcimaMedia++;
        }

        System.out.println("\nA quantidade de funcionarios com salarios acima da média é: " + salariosAcimaMedia);
    }
}
