package exercicio1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {
    private String nome;
    private double altura;
    private Calendar dataNasc;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setDatanasc(int dia, int mes, int ano) {
        this.dataNasc = Calendar.getInstance();
        dataNasc.set(ano, mes - 1, dia);
    }

    public String getDataNasc() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date data = this.dataNasc.getTime();
        return df.format(data);
    }

    public void getInfo() {
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(getAltura());
        System.out.println(getDataNasc());
    }

    public int getIdade() {
        Calendar dataAtual = Calendar.getInstance();

        int idade = dataAtual.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR);

        boolean diaPassou = dataNasc.get(Calendar.DAY_OF_MONTH) >= dataAtual.get(Calendar.DAY_OF_MONTH);
        boolean mesPassou = dataNasc.get(Calendar.MONTH) + 1 >= dataAtual.get(Calendar.MONTH) + 1;

        if (diaPassou && mesPassou)
            idade++;

        return idade;
    }
}
