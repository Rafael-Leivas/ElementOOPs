package elementos.Personagens;

import elementos.ELemento;

public class Agua extends ELemento {

    private String nome;

    public Agua() {
        super();
        setNome(nome);
    }

    public void setNome(String nome) {
        this.nome = "WaveNerd";
    }

    public String toString() {
        return String.format("Nome: %s, ", nome) + super.toString();         
    }
    
}
