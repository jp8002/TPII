package domain;

public class Lagarto extends Algoritmo{

    @Override
    public void executar(TipoJogada tipo) {
        switch (tipo) {
            case LAGARTO -> System.out.println("Lagarto e Lagarto. Empate");
            
            //vitórias
            case PAPEL -> System.out.println("Lagarto come Papel. Vc ganhou.");
            case SPOCKY -> System.out.println("Lagarto envenena Spocky. Vc ganhou.");

            //derrotas
            case PEDRA ->System.out.println("Pedra esmaga o Lagarto. Pc ganhou.");
            case TESOURA -> System.out.println("Tesoura decapita Lagarto. Pc ganhou.");
        }
    }

}
