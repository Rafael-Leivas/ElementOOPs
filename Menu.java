import java.util.Scanner;

public class Menu {
    private static final Scanner sc = new Scanner(System.in);
    
    public static int iniciarGame() {
        int jogar;
        do {
            System.out.println("------------------------------------");
            System.out.print("---- Guerra de elementos ----\n[1] - Iniciar jogo;\n[0] - Sair\n");
            while (!sc.hasNextInt()) {
                sc.next(); // Limpar a entrada não válida
                System.out.println("Digite um número válido (0 ou 1).");
            }
            jogar = sc.nextInt(); 
            if (jogar == 0)
                break;
        } while(jogar != 0 && jogar != 1);
        System.out.printf("O número escolhido foi: %d.\n" ,jogar);
        return jogar;
    }

    public static int escolhaPersonagem() {
        int elemento;
        do {
            System.out.println("------------------------------------");
            System.out.printf("Escolha um elemento\n [1] - WaveNerd(Água);\n [2] - StoneDev(Terra);\n [3] - BurnCoder(Fogo);\n [4] - BreezeHacker(Ar);\n [0] - Sair;\n");
            while (!sc.hasNextInt()) {
                sc.next(); // Limpar a entrada não válida
                System.out.println("Digite um número válido (0 a 4).");
            }
            elemento = sc.nextInt();
            if (elemento == 0)
                break;
        } while(elemento > 0 || elemento < 4);
        return elemento;
    }

}
