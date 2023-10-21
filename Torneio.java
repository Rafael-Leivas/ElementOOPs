public class Torneio {

    public static void realizarBatalha(Elemento personagem1, Elemento personagem2) {

        int velocidade1 = personagem1.getVelocidade();
        int velocidade2 = personagem2.getVelocidade();
        
        if (velocidade1 > velocidade2) {
            System.out.println("-------------------------------------------------------");
            System.out.println("VOCÊ CONTÉM A VELOCIDADE MAIOR E ATACA PRIMEIRO");
            
            while (personagem1.getVida() > 0 && personagem2.getVida() > 0) {
                int escolherAtaque = Menu.atacar();
                if (escolherAtaque == 1) {
                    int danoCausado = personagem1.atacar(personagem2.getDefesa());
                    diminuirVida(personagem2, danoCausado);
    
                    System.out.println("DANO CAUSADO");
                    System.out.println("Ataque do " + personagem1.getNome() + ": " + danoCausado);
                    System.out.println("Vida do " + personagem2.getNome() + ": " + personagem2.getVida());
                    System.out.println("-------------------------------------------------------");
                } else if (escolherAtaque == 2) {
                    // Implemente a lógica do ataque elemental
                }
            }
        } else if (velocidade1 < velocidade2) {
            System.out.println("-------------------------------------------------------");
            System.out.println("SEU OPONENTE CONTÉM A VELOCIDADE MAIOR E ATACA PRIMEIRO");
        } else {
            System.out.println("-------------------------------------------------------");
            System.out.println("VOCÊS CONTÉM A MESMA VELOCIDADE");
        }
    }

    public static void diminuirVida(Elemento personagem, int danoCausado) {
        int vida = personagem.getVida();
        vida -= danoCausado;
        personagem.setVida(vida);
    }

}
