public class Torneio {

    public static void realizarBatalha(Elemento personagem1, Elemento personagem2) {

        int velocidade1 = personagem1.getVelocidade();
        int velocidade2 = personagem2.getVelocidade();

        System.out.println("-------------------------------------------------------");
        System.out.println("Velocidade do " + personagem1.getNome() + ": " + personagem1.getVelocidade() +  ", Vida: " + personagem1.getVida());
        System.out.println("Velocidade do " + personagem2.getNome() + ": " + personagem2.getVelocidade() +  ", Vida: " + personagem2.getVida());
        System.out.println("-------------------------------------------------------");
        
        if (velocidade1 > velocidade2) {
            System.out.println("Personagem um ataca primeiro");
            int escolherAtaque = Menu.atacar();
            
            if (escolherAtaque == 1) {
                int danoCausado = personagem1.atacar(personagem2.getDefesa());

                diminuirVida(personagem2, danoCausado);
                System.out.println("-------------------------------------------------------");
                System.out.println("DANO CAUSADO");
                System.out.println("Vida do " + personagem2.getNome() + ": " + personagem2.getVida());
                System.out.println("Ataque do " + personagem1.getNome() + ": " + danoCausado);
                System.out.println("-------------------------------------------------------");
            } else if (escolherAtaque == 2) {
                // Implemente a lógica do ataque elemental
            }
            
            System.out.println("-------------------------------------------------------");
            System.out.println("DANO CAUSADO");
            System.out.println(personagem1.getNome() + " ataca com " + personagem1.getVelocidade() + " de velocidade");
            System.out.println(personagem2.getNome() + " ataca com " + personagem2.getVelocidade() + " de velocidade");
            System.out.println("-------------------------------------------------------");
        } else {
            System.out.println("Personagem dois ataca primeiro");
        }
    }

    public static void diminuirVida(Elemento personagem, int danoCausado) {
        System.out.println("VIDA PERSONAGEM: " + personagem.getVida());
        int vida = personagem.getVida();
        vida -= danoCausado;
        personagem.setVida(vida);
    }

}
