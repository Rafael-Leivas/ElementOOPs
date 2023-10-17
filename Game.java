public class Game {
    public static void main (String[] args){

        int jogar = Menu.iniciarGame();
        if (jogar == 1){
            int elemento = Menu.escolhaPersonagem();
            System.out.printf("O número escolhido foi: %d.\n" ,elemento);
        }
    }
}
