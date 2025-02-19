package domain;

public class Spocky extends Algoritmo{

    @Override
    public void executar(TipoJogada tipo) {
        switch (tipo) {
            case SPOCKY -> System.out.println("Spocky e Spocky. Empate");

            //vitórias
            case PEDRA -> System.out.println("Spocky desintegra Pedra. Vc ganhou.");
            case TESOURA -> System.out.println("Spocky derrete Tesoura. Vc ganhou");

            // derrotas
            case PAPEL -> System.out.println("Papel refuta Spocky. Pc ganhou.");
            case LAGARTO-> System.out.println("Lagarto envenena Spocky. Pc ganhou.");
        }
    }

}
