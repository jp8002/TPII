package domain;

public class Tesoura extends Algoritmo{

    @Override
    public void executar(TipoJogada tipo) {
        switch(tipo){
            case TESOURA -> System.out.println("Tesoura e Tesoura. empate");

            //derrotas
            case PEDRA -> System.out.println("Pedra quebra Tesouira. Pc ganhou");
            case SPOCKY -> System.out.println("Spocky derrete Tesoura. Pc ganhou");

            
            //vitórias
            case PAPEL -> System.out.println("Tesoura corta papel. Vc ganhou");
            case LAGARTO -> System.out.println("Tesoura decapita Lagarto. Vc ganhou");

        }
    }

}
