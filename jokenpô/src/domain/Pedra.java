package domain;

public class Pedra extends Algoritmo{

    @Override
    public void executar (TipoJogada tipo){
        switch(tipo){
            
            case PEDRA -> System.out.println("Pedra e Pedra. Empate");

            //derrotas

            case PAPEL -> System.out.println("Papel cobre pedra. O pc ganhou");
            case SPOCKY -> System.out.println("Spocky desintegra Pedra. pc ganhou");

            //vitórias
            case TESOURA -> System.out.println("Pedra quebra Tesoura. O vc ganhou");
            case LAGARTO -> System.out.println("Pedra esmaga Lagarto. O vc ganhou");
            
        }
    }
}
