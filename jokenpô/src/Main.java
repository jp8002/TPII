
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import domain.Algoritmo;
import domain.Jokenpo;
import domain.TipoJogada;
import java.util.Scanner;
import java.util.Random;

public class Main {
    //private static final Integer PAPEL = 1;

    public static void main(String[] args) {

        
        Scanner cin = new Scanner(System.in);
        Random rand = new Random();
        int escolha, pc;

        System.out.printf("Escolha um movimeto\n" +
                        "1- Papel\n" +
                        "2- Tesoura\n" +
                        "3- Pedra\n" +
                        "4 - Lagarto\n" +
                        "5 - Spocky\n");

        escolha = cin.nextInt();

        pc = rand.nextInt(3) + 1;

        TipoJogada jogadaUsuario = TipoJogada.getById(escolha);
        TipoJogada jogadaPc = TipoJogada.getById(pc);
    
        System.out.println("O Player escolhe: " + jogadaUsuario);
        System.out.println("O PC escolhe: " + jogadaPc);

        Algoritmo algoritmo = Algoritmo.getAlgoritmo(jogadaUsuario);

        Jokenpo  jokenpo = new Jokenpo(algoritmo);
        jokenpo.jogar(jogadaPc);

        cin.close();

    }
}
