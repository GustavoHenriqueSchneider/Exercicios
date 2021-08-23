import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String numeroBinario = "";

        System.out.println("Insira um número inteiro para converte-lo em binário:");
        numero = scanner.nextInt();

        for (int i = 0; numero > 0; i++) {

            int resto = numero % 2;
            numero = (numero - resto) / 2;
            numeroBinario = numeroBinario.concat(String.valueOf(resto));

        }

        StringBuilder builder = new StringBuilder(numeroBinario);
        String binarioCorrigido = builder.reverse().toString();

        System.out.println("\nO resultado em binário é: " + binarioCorrigido);

    }
}
