import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double P, A, i, valorTotalJuros, valorTotalEmprestimo;
        int qntMeses;

        System.out.println("Insira o valor a realizar empréstimo: ");
        P = scanner.nextDouble();
        System.out.println("Insira a parcela do emprestimo a ser paga mensalmente: ");
        A = scanner.nextDouble();
        System.out.println("Insira a porcentagem de taxa sobre o valor do empréstimo: ");
        i = scanner.nextDouble();





        for(int j=1; i<=qntMeses; i++){
            System.out.printf("\nMês %d:",j);
            System.out.printf("\nValor em dinheiro dos juros pagos: R$%.2f",jurosMensal);
            System.out.printf("\nValor em dinheiro aplicado no pagamento da dívida: R$%.2f",valorParcela);
            System.out.printf("\nValor acumudado de juros já pagos: R$%.2f",jurosPagos);
            System.out.printf("\nValor a ser pago no proximo mês: R$%.2f",valorParcela);


        }
    }
}
