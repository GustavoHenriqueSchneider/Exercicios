import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] mesAtual = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int mes;
//        String mesAtual = "";
//
        for (int i = 0; i < 12; i++) {
            do {
                System.out.println("Insira o número correspondente ao mês: ");
                mes = scanner.nextInt();
            } while (mes <= 0 || mes > 12);
//
//            switch (mes) {
//                case 1:
//                    mesAtual = "Janeiro";
//                    break;
//                case 2:
//                    mesAtual = "Fevereiro";
//                    break;
//                case 3:
//                    mesAtual = "Março";
//                    break;
//                case 4:
//                    mesAtual = "Abril";
//                    break;
//                case 5:
//                    mesAtual = "Maio";
//                    break;
//                case 6:
//                    mesAtual = "Junho";
//                    break;
//                case 7:
//                    mesAtual = "Julho";
//                    break;
//                case 8:
//                    mesAtual = "Agosto";
//                    break;
//                case 9:
//                    mesAtual = "Setembro";
//                    break;
//                case 10:
//                    mesAtual = "Outubro";
//                    break;
//                case 11:
//                    mesAtual = "Novembro";
//                    break;
//                case 12:
//                    mesAtual = "Dezembro";
//                    break;
//            }
//
            System.out.println("\nO mês correspondente é: " + mesAtual[mes - 1] + "\n");
        }
    }
}
