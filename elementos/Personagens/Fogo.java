package elementos.Personagens;

import elementos.ELemento;

public class Fogo extends ELemento{

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
