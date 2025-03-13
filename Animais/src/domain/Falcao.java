package domain;

public class Falcao extends Ave implements Voador, Oviparo{
    public Falcao(String nome, String sexo){
        super(nome,sexo);
    }

    @Override
    void barulho() {
        System.out.printf("%n está croando", getClass().getSimpleName());
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
