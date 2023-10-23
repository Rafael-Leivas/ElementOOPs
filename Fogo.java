public class Fogo extends Elemento{

    private String nome;
    private String elemento;

    public Fogo() {
        super();
        this.nome = "BurnCoder (fogo)";
        this.elemento = "Fogo";
    }

    public String getNome() {
        return nome;
    }

    public String getElemento() {
        return elemento;
    }

    @Override
    public int utilizarEspecial(int poder, int ataque, int defesaOponente, String nome) {

        if (elemento.equals("Ar")) {
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
