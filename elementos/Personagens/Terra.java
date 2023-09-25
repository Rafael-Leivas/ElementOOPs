package elementos.Personagens;

import elementos.ELemento;

public class Terra extends ELemento {

    private String nome;

    public Terra() {
        super();
        this.nome = "StoneDev";
    }

    public String getNome() {
        return nome;
    }
    
    public String toString() {
        return String.format("Nome: %s, ", nome) + super.toString();         
    }
}
