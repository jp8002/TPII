package domain;

public class Leao extends Mamifero implements Territorial{
    public Leao(String nome, String sexo) {
        super(nome, sexo);
    }

    @Override
    public void patrulhar() {
        System.out.println("Patrulhando!!!!!!!");
    }
}
