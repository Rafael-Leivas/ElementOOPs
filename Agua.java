

public class Agua extends Elemento {

    private String nome;

    public Agua() {
        super();
        this.nome = "WaveNerd";
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return String.format("Nome: %s, ", nome) + super.toString();         
    }
    
}
