package torneio;

import java.awt.Menu;

public class Torneio extends Menu {
    
    @Override
    public int iniciarGame() {
        int jogar;
        do {
            System.out.println("------------------------------------");
            System.out.print("---- Guerra de elementos ----\n[1] - Iniciar torneio;\n[0] - Sair\n");
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
