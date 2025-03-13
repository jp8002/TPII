package domain;

public class Penguim extends Ave implements Oviparo{
    public Penguim(String nome, String sexo) {
        super(nome, sexo);
    }
    @Override
    void barulho() {
        System.out.printf("%n noot noot", getClass().getSimpleName());
    }

    @Override
    public void botaOvo() {
        System.out.println("Botando!!!!!");
    }
}
