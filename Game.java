import java.util.Scanner;

import elementos.Personagens.Agua;
import elementos.Personagens.Ar;
import elementos.Personagens.Fogo;
import elementos.Personagens.Terra;

public class Game {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int jogar;
        int elemento;

        do {
            System.out.println("------------------------------------");
            System.out.print("Se deseja iniciar o Jogo tecle [1], caso queira sair tecle [0]: ");
            jogar = sc.nextInt(); 
            if (jogar != 0) {
                do {
                    System.out.println("------------------------------------");
                    System.out.printf("Escolha um dos quatro elementos ou digite 0 para sair, [1] - WaveNerd(Água), [2] - StoneDev(Terra), [3] - BurnCoder(Fogo), [4] - BreezeHacker(Ar): ");
                    elemento = sc.nextInt();
                }while(elemento < 0 || elemento > 4);
        
                if (elemento != 0){
                    do {
                        System.out.println("------------------------------------");
                        System.out.print("Se deseja jogar o torneio tecle [1], caso queira sair tecle [0]: ");
                        jogar = sc.nextInt(); 
                        
                        if (jogar == 1) {
                            System.out.println("------------------------------------");
                            Agua agua = new Agua();
                            Ar ar = new Ar();
                            Fogo fogo = new Fogo();
                            Terra terra = new Terra();
                            System.out.println(agua);
                            System.out.println(ar);
                            System.out.println(fogo);
                            System.out.println(terra);
                        }
                    }while(jogar != 0);
                }
            }
        }while(jogar != 0 && jogar != 1);
    }
}
