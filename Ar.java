public class Ar extends Elemento{

    private String nome;
    private String elemento;

    public Ar() {
        super();
        this.nome = "BreezeHacker (ar)";
        this.elemento = "Ar";
    }

    public String setNome() {
        return nome;
    }

    public String setElemento() {
        return elemento;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public int utilizarEspecial(int poder, int ataque, int defesaOponente, String nome) {

        if (elemento.equals("Terra")) {
            System.out.println("Especial do Ar");
            int dano = poder * ataque / defesaOponente * 2;
            return dano;
        } else {
            System.out.println("Especial do Ar");
            int dano = poder * ataque / defesaOponente;
            return dano;
        }
    }
    
    public String toString() {
        return String.format("\nNome: %s\nTipo: %s", nome, elemento) + super.toString();         
    }
}
