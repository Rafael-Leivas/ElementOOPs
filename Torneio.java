public class Torneio {

    public static void realizarBatalha(Elemento personagem1, Elemento personagem2) {
        if (personagem1.getVelocidade() > personagem2.getVelocidade()) {
            System.out.println("Personagem 1 ataca primeiro");
        } else {
            System.out.println("Personagem 2 ataca primeiro");
        }
    }

}
