package domain;

public class Jokenpo {

    private Algoritmo algoritmo;

    public Jokenpo(Algoritmo algoritmo){
        this.algoritmo = algoritmo;
    }

    public void jogar(TipoJogada tipo){
        this.algoritmo.executar(tipo);
    }
}
