public class Game {
    public static void main (String[] args){

        int opcao = Menu.iniciarGame();
        if (opcao == 1){
            int opcaoElemento = Menu.escolherPersonagem();

            if (opcaoElemento > 0 && opcaoElemento <= 4) {
                Elemento[] personagens = gerarPersonagem();

                Elemento personagemEscolhido = personagens[opcaoElemento - 1];
                System.out.println("------------------------------------");
                System.out.println("PERSONAGEM ESCOLHIDO");
                System.out.println(personagemEscolhido);

                int opcaoTorneio = Menu.iniciarTorneio();

                if (opcaoTorneio == 1) {
                    for (int i = 0; i < personagens.length; i++) {
                        if (i != opcaoElemento - 1) {

                            System.out.println("------------------------------------");
                            System.out.println("BATALHA NÚMERO " + (i + 1));
                            System.out.println(personagemEscolhido.getNome() + " enfrenta " + personagens[i].getNome() + ":");
                            System.out.println("\nCARACTERISTICAS DO SEU PERSONAGEM:\n " + personagemEscolhido);
                            System.out.println("\nCARACTERISTICAS DO SEU OPONENTE:\n" + personagens[i]);
                            boolean jogadorVenceu = Torneio.realizarBatalha(personagemEscolhido, personagens[i]);
                            if (jogadorVenceu == false) {
                                break;
                            } else {
                                if (i < 3 && jogadorVenceu) {
                                    int proximaBatalha = Menu.iniciarProximaBatalha();
                                    if (proximaBatalha == 0) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            
                        }
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