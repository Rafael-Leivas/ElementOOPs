package elementos.Personagens;

import elementos.ELemento;

public class Ar extends ELemento{

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
        return String.format("Nome: %s, ", nome) + super.toString();         
    }
}
