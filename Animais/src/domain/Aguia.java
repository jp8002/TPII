package domain;

public class Aguia extends Ave implements Voador, Oviparo{
    public Aguia(String nome, String sexo){
        super(nome,sexo);
    }
    @Override
    void barulho() {
        System.out.printf("%n croac croac", getClass().getSimpleName());
    }
    @Override
    public void voar() {
        System.out.println("Voando");
    }

    @Override
    public void botaOvo() {
        System.out.println("Botando!!!!!!!");
    }
}