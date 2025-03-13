package domain;

public class Ornintorrinco extends Mamifero implements Oviparo{
    public Ornintorrinco(String nome, String sexo) {
        super(nome, sexo);
    }

    @Override
    public void botaOvo() {
        System.out.println("Botando!!!");
    }
}
