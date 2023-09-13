import java.util.Scanner;

import personagnes.Personagem;

import java.util.Random;

public class Game {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int jogar;
        int elemento;
        String elementoEscolhido;

        do {
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.print("Se deseja iniciar o Jogo tecle 1, caso queira sair tecle 0: ");
            jogar = sc.nextInt(); 
            if (jogar != 0) {
                do {
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.printf("Escolha um dos quatro elementos ou digite 0 para sair, [1] - WaveNerd(Água), [2] - StoneDev(Terra), [3] - BurnCoder(Fogo), [4] - BreezeHacker(Ar): ");
                    elemento = sc.nextInt();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
                }while(elemento < 0 || elemento > 4);
        
                if (elemento != 0){
                    Personagem agua = new Personagem("WaveNerd", 0, 0, 0, 0, 0);
                    agua.atacar();

                }
    
            }
        }while(jogar != 0 && jogar != 1);
    }
}
