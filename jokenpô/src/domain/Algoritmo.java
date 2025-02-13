package domain;

public abstract class Algoritmo {
    public abstract void executar(TipoJogada tipo);

    public static Algoritmo getAlgoritmo(TipoJogada tipo){
        switch (tipo){
            case PAPEL:
                return new Papel();
            
            case PEDRA:
                return new Pedra();
            
            case TESOURA:
                return new Tesoura();
            
            case LAGARTO:
                return new Lagarto();

            case SPOCKY:
                return new Spocky();
        }
        
        return null;

    }
}


