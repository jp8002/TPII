package domain;

public abstract class Animal {
    String nome;
    String sexo;

    Animal (String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;
    }

    public void comer(String comida){
        System.out.println("comendo " + comida);
    }

    public void dormir(){
        System.out.println("Zzz");
    }

    abstract void barulho();
}
