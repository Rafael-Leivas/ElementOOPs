

public class Fogo extends Elemento{

    private String nome;

    public Fogo() {
        super();
        this.nome = "BurnCoder";
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return String.format("Nome: %s, ", nome) + super.toString();         
    }
}
