

public class Ar extends Elemento{

    private String nome;

    public Ar() {
        super();
        setNome(nome);
    }

    public void setNome(String nome) {
        this.nome = "BreezeHacker";
    }

    public String getNome() {
        return this.nome;
    }
    
    public String toString() {
        return String.format("\nNome: %s", nome) + super.toString();         
    }
}
