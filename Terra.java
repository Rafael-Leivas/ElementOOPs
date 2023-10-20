

public class Terra extends Elemento {

    private String nome;

    public Terra() {
        super();
        this.nome = "StoneDev";
    }

    public String getNome() {
        return nome;
    }
    
    public String toString() {
        return String.format("\nNome: %s", nome) + super.toString();         
    }
}
