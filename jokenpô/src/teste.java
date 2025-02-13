
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Random;
public class teste {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner cin = new Scanner(System.in);
        Random rand = new Random();
        int escolha, pc;

        String lista[] = {"Papel ", "Tesoura","Pedra 3" };
        String vitoria[][] = {
                {"Papel e papel. empate","Tesoura corta papel. O pc ganhou","Papel cobre pedra. O player ganhou","O Lagarto come o papel. O pc ganhou","O Papel refuta o Spocky. O player ganhou;"},
                {"Tesoura corta papel. O player ganhou", "Tesoura e Tesoura. empate", "Pedra quebra tesoura. O pc ganhou","Tesoura decapita lagarto. O Player ganhou", "Spock derrete tesoura. O pc ganhou"},
                {"Pedra quebra tesoura. O player ganhou", "Papel cobre pedra. O pc ganhou", "Pedra e pedra. empate", "Pedra esmaga lagarto. O player ganhou", "Spock vaporiza pedra. O pc ganhou"},
                {"Lagarto come papel. O player ganhou.","Tesoura decapita lagarto. O pc ganhou" ,"Pedra esmaga lagarto. O pc ganhou", "Lagarto e Lagarto. empate", "Lagarto envenena Spock. O player ganhou"},
                {"Papel refuta Spock. O pc ganhou","Spock derrete tesoura. O player ganhou", "Spock vaporiza pedra. O player ganhpu", "Lagarto envenena Spock. O pc ganhou.", "Spocky e Spocky. empate"}
        };

        System.out.printf("Escolha um movimeto\n" +
                        "1- Papel\n " +
                        "2- Tesoura\n" +
                        "3- Pedra\n" +
                        "4- Lagarto\n" +
                        "5- Spocky\n");

        escolha = cin.nextInt();

        pc = rand.nextInt(3) + 1;

        System.out.println(pc);

        System.out.print("Player|  X  |PC\n");

        System.out.printf(lista[escolha-1] +"| X |" + lista[pc-1] + "\n");

        System.out.printf(vitoria[escolha-1][pc-1]);


    }
}
