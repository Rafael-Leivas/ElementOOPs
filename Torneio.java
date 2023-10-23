import java.util.Random;

public class Torneio {
    static Random random = new Random();

    public static boolean realizarBatalha(Elemento meuPersonagem, Elemento oponente) {

        int velocidade1 = meuPersonagem.getVelocidade();
        int velocidade2 = oponente.getVelocidade();

        int vidaPersonagem = meuPersonagem.getVidaAleatoria();
        
        if (velocidade1 > velocidade2) {
            System.out.println("-------------------------------------------------------");
            System.out.println("VOCÊ CONTÉM A VELOCIDADE MAIOR E ATACA PRIMEIRO");
            System.out.println("-------------------------------------------------------");
            
            while (meuPersonagem.getVida() > 0 && oponente.getVida() > 0) {

                System.out.println(">> REALIZAR ATAQUE <<");

                int escolherAtaque = Menu.atacar();
                if (escolherAtaque == 0)
                        break;
                ataqueElemento(escolherAtaque, meuPersonagem, oponente);
                
                System.out.println(">> ATAQUE DO OPONENTE <<");
                ataqueOponente(oponente, meuPersonagem);

            }

        } else if (velocidade1 < velocidade2) {
            System.out.println("-------------------------------------------------------");
            System.out.println("SEU OPONENTE CONTÉM A VELOCIDADE MAIOR E ATACA PRIMEIRO");
            System.out.println("-------------------------------------------------------");

            while (meuPersonagem.getVida() > 0 && oponente.getVida() > 0) {

                System.out.println(">> ATAQUE DO OPONENTE <<");
                ataqueOponente(oponente, meuPersonagem);
                
                if (meuPersonagem.getVida() > 0){
                    System.out.println(">> REALIZAR ATAQUE <<-");
                    int escolherAtaque = Menu.atacar();
                    if (escolherAtaque == 0)
                        break;
                    ataqueElemento(escolherAtaque, meuPersonagem, oponente);
                }
            }

        } else {
            System.out.println("-------------------------------------------------------");
            System.out.println("VOCÊS CONTÉM A MESMA VELOCIDADE E COM ISTO ATACA PRIMEIRO");
            System.out.println("-------------------------------------------------------");

            while (meuPersonagem.getVida() > 0 && oponente.getVida() > 0) {

                System.out.println(">> REALIZAR ATAQUE <<");

                int escolherAtaque = Menu.atacar();
                if (escolherAtaque == 0)
                        break;
                ataqueElemento(escolherAtaque, meuPersonagem, oponente);
                
                System.out.println(">> ATAQUE DO OPONENTE <<\n");
                ataqueOponente(oponente, meuPersonagem);

            }
        }
        
        if (meuPersonagem.getVida() > 0) {
            System.out.println("--- VOCÊ VENCEU A BATALHA---");
            System.out.println("---------------------------------------");
            meuPersonagem.setVida(vidaPersonagem);
            return true;
        } else {
            System.out.println("--- OPONENTE VENCEU ---");
            System.out.println("---------------------------------------");
            return false;
        }
    }

    public static void diminuirVida(Elemento personagem, int danoCausado) {
        int vida = personagem.getVida();
        vida -= danoCausado;
        personagem.setVida(vida);
    }

    public static void ataque(Elemento personagem1, Elemento personagem2) {
        int danoCausado = personagem1.atacar(personagem2.getDefesa());
        diminuirVida(personagem2, danoCausado);

        System.out.println("DANO CAUSADO COM ATAQUE FÍSICO: " + danoCausado);
        System.out.println("\nVida do " + personagem1.getNome() + ": " + personagem1.getVida() + "\nVida do " + personagem2.getNome() + ": " + personagem2.getVida());
        System.out.println("-------------------------------------------------------");
    }

    public static void ataqueElemental(Elemento personagem1, Elemento personagem2) {
        int danoCausado = personagem1.utilizarEspecial(personagem1.getPoder(), personagem1.getAtaque(), personagem2.getDefesa(), personagem2.getNome());
        diminuirVida(personagem2, danoCausado);

        System.out.println("--- DANO CAUSADO COM ATAQUE ELEMENTAL: " + danoCausado);
        System.out.println("\nVida do " + personagem1.getNome() + ": " + personagem1.getVida() + "\nVida do " + personagem2.getNome() + ": " + personagem2.getVida());
        System.out.println("-------------------------------------------------------");
    }

    public static boolean ataqueElemento(int escolherAtaque, Elemento personagem1, Elemento personagem2) {
        if (escolherAtaque == 1) {
            ataque(personagem1, personagem2);
        } else if (escolherAtaque == 2) {
            ataqueElemental(personagem1, personagem2);
        } else {
            return false;
        }
        return false;
    }

    public static void ataqueOponente(Elemento personagem1, Elemento personagem2) {
        int escolherAtaque = random.nextInt(2) + 1;
        if (escolherAtaque == 1) {
            ataque(personagem1, personagem2);
        } else if (escolherAtaque == 2) {
            ataqueElemental(personagem1, personagem2);
        }
    }
}
