import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira uma palavra abaixo para verificar se ela é um palindromo:");
        String palavra = scanner.nextLine();
        palavra=palavra.toUpperCase(Locale.ROOT);
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        if(palavra.equals(palavraInvertida))
            System.out.println("É um palindromo");
        else
            System.out.println("Não é um palindromo");
    }
}
