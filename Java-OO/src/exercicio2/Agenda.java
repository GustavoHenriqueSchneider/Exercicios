package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private int cadastro = 0;
    private int qntPessoas = 10;
    private List pessoa = new ArrayList<Pessoa>();

    public void armazenaPessoa(String nome, int idade, float altura) {
        if (cadastro < (qntPessoas - 1)) {
            pessoa[cadastro].setNome(nome);
            pessoa[cadastro].setIdade(idade);
            pessoa[cadastro].setAltura(altura);

            cadastro++;
        }
        else
        System.out.println("A agenda está lotada!");
    }

//    public void removePessoa(String nome) {
//        for (int i = 0; i < pessoa.length; i++) {
//            if(pessoa[i].getNome().equals(nome)){
//                pessoa
//            }
//        }
//    }

    public int buscaPessoa(String nome) {

    }

    public void imprimeAgenda() {

    }

    public void imprimePessoa(int index) {

    }
}
