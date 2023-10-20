
import java.util.Scanner;

public interface Menu {
    
    public static int iniciarGame() {
        int jogar;
        Scanner sc = new Scanner(System.in);
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

    public static int escolherPersonagem() {
        int elemento;
        Scanner sc = new Scanner(System.in);
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
        } while(elemento != 0 && elemento != 1 && elemento != 2 && elemento != 3 && elemento != 4 );
        return elemento;
    }

    public static int iniciarTorneio() {
        int jogar;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------------------------------------");
            System.out.print("---- Começe a Guerra ----\n[1] - Iniciar torneio;\n[0] - Sair\n");
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

    public static int atacar() {
        int ataque;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------------------------------------");
            System.out.printf("Escolha seu ataque\n[1] - Ataque físico;\n[2] - Ataque elemental;\n[0] - Sair;\n");
            while (!sc.hasNextInt()) {
                sc.next(); // Limpar a entrada não válida
                System.out.println("Digite um número válido (0 a 2).");
            }
            ataque = sc.nextInt();
            if (ataque == 0)
                break;
        } while(ataque != 0 && ataque != 1 && ataque != 2);
        return ataque;
    }

    public static int iniciarProximaBatalha() {
        int jogar;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------------------------------------");
            System.out.print("---- Batalha ----\n[1] - Próxima batalha;\n[0] - Sair\n");
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
}