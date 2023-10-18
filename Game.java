public class Game {
    public static void main (String[] args){

        int opcao = Menu.iniciarGame();
        if (opcao == 1){
            int opcaoElemento = Menu.escolherPersonagem();

            if (opcaoElemento > 0 && opcaoElemento <= 4) {
                Elemento[] personagens = gerarPersonagem();

                Elemento personagemEscolhido = personagens[opcaoElemento - 1];
                System.out.println("Personagem escolhido: " + personagemEscolhido);

                for (int i = 0; i < personagens.length; i++) {
                    if (i != opcaoElemento - 1) {
                        System.out.println(personagemEscolhido.getNome() + " enfrenta " + personagens[i].getNome() + ":");
                        Torneio.realizarBatalha(personagemEscolhido, personagens[i]);
                    }
                }


            }
        }
    }

    public static Elemento[] gerarPersonagem() {
        Elemento[] personagem = new Elemento[4];
        personagem[0] = new Agua();
        personagem[1] = new Terra();
        personagem[2] = new Fogo();
        personagem[3] = new Ar();
        return personagem;
    }
}