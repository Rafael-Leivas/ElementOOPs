public class Terra extends Elemento {

    private String nome;
    private String elemento;

    public Terra() {
        super();
        this.nome = "StoneDev (terra)";
        this.elemento = "Terra";
    }

    public String getNome() {
        return nome;
    }

    public String getElemento() {
        return elemento;
    }

    @Override
    public int utilizarEspecial(int poder, int ataque, int defesaOponente, String nome) {

        if (elemento.equals("Água")) {
            int dano = poder * ataque / defesaOponente * 2;
            return dano;
        } else {
            int dano = poder * ataque / defesaOponente;
            return dano;
        }
    }
    
    public String toString() {
        return String.format("\nNome: %s\nTipo: %s", nome, elemento) + super.toString();         
    }
}
