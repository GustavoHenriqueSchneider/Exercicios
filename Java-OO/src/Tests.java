import exercicio1.Pessoa;
import exercicio2.Agenda;

public class Tests {
    public static void main(String[] args){
        // ---------------- Exercicio 1 ------------------------------
        Pessoa p1 = new Pessoa();
        p1.setNome("Gustavo");
        p1.setAltura(1.78);
        p1.setDatanasc(03,03,2002);
        p1.getInfo();

        // ---------------- Exercicio 2 ------------------------------
        Agenda agenda = new Agenda();
        agenda.armazenaPessoa("Gustavo",19,1.78f);


    }
}
