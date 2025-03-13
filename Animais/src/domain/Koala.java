package domain;

public class Koala extends Mamifero{
    public Koala(String nome, String sexo) {
        super(nome, sexo);
    }

    @Override
    void barulho() {
        System.out.printf("%n está guinchando", getClass().getSimpleName());
    }

}
