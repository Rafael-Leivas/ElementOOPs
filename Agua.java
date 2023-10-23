public class Agua extends Elemento {

    private String nome;
    private String elemento;

    public Agua() {
        super();
        this.nome = "WaveNerd (água)";
        this.elemento = "Água";
    }

    public String getNome() {
        return nome;
    }

    public String getElemento(){
        return elemento;
    }

    @Override
    public int utilizarEspecial(int poder, int ataque, int defesaOponente, String nome) {

        if (elemento.equals("Fogo")) {
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
