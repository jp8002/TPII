package domain;

public class Papel extends Algoritmo {

    @Override
    public void executar(TipoJogada tipo) {
        switch(tipo){
            case PAPEL -> System.out.println("Papel e papel. empate");

            //derrotas
            case TESOURA -> System.out.println("Tesoura corta papel. O pc ganhou");
            case LAGARTO -> System.out.println("Lagarto come papel. O pc ganhou");

            //vitórias
            case PEDRA -> System.out.println("Papel cobre Pedra. Vc ganhou");
            case SPOCKY -> System.out.println("Papel refuta Spocky. Vc ganhou");
        }
    }
}
