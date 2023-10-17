public class Game {
    public static void main (String[] args){

        int jogar = Menu.iniciarGame();
        if (jogar == 1){
            int elemento = Menu.iniciarProximaBatalha();
            System.out.printf("O número escolhido foi: %d.\n" ,elemento);
        } else {
            System.out.println("Volte sempre. s2");
        }
    }
}
