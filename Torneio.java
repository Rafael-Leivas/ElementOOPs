public class Torneio {

    public static void realizarBatalha(Elemento personagem1, Elemento personagem2) {

        if (personagem1.getVelocidade() > personagem2.getVelocidade()) {
            int escolherAtaque = Menu.atacar();
            
            if (escolherAtaque == 1) {
                int danoCausado = personagem1.atacar();
                diminuirVida(personagem2, danoCausado);
            } else if (escolherAtaque == 2) {
                // Implemente a lógica do ataque elemental
            }
            
            System.out.println(personagem1.getNome() + " ataca com " + personagem1.getVelocidade() + " de velocidade");
            System.out.println(personagem2.getNome() + " ataca com " + personagem2.getVelocidade() + " de velocidade");
        } else {
            int escolherAtaque = Menu.atacar();
            
            if (escolherAtaque == 1) {
                int danoCausado = personagem2.atacar();
                diminuirVida(personagem1, danoCausado);
            } else if (escolherAtaque == 2) {
                // Implemente a lógica do ataque elemental
            }

            System.out.println(personagem2.getNome() + " ataca com " + personagem2.getVelocidade() + " de velocidade");
            System.out.println(personagem1.getNome() + " ataca com " + personagem1.getVelocidade() + " de velocidade");
        }
        
    }

    public static void diminuirVida(Elemento personagem, int dano) {
        int vida = personagem.getVida();
        vida -= dano;
        personagem.setVida(vida);
    }

}
