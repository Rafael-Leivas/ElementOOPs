
import javax.swing.text.html.parser.Element;

public class Game {
    public static void main (String[] args){

        int opcao = Menu.iniciarGame();
        if (opcao == 1){
            int opcaoElemento = Menu.escolherPersonagem();

            if (opcaoElemento > 0 && opcaoElemento <= 4) {
                Elemento[] personagens = gerarPersonagem();
                System.out.println(personagens[opcaoElemento - 1]);
            }
        }
    }

    public static Elemento[] gerarPersonagem() {
        Elemento[] personagem = new Elemento[4];
        personagem[0] = new Terra();
        personagem[1] = new Agua();
        personagem[2] = new Fogo();
        personagem[3] = new Ar();
        return personagem;
    }
}