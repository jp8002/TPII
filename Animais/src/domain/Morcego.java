package domain;

public class Morcego extends Mamifero implements Voador, Oviparo{
    public Morcego(String nome, String sexo){
        super(nome, sexo);
    };

    @Override
    public void botaOvo() {
        System.out.println("Botando!!!");
    }


    @Override
    public void voar() {
        System.out.println("Voando");
    }
}
