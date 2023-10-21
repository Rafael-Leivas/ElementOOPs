

import java.util.Random;

public class Elemento {
    static Random random = new Random();

    private int poder;
    protected int ataque;
    private int defesa;
    private int velocidade;
    private int vida;
    private int ferimento;

    public Object toString;

    public Elemento() {
        setPoder();
        setAtaque();
        setDefesa();
        setVelocidade();
        setVidaAleatoria();
    }

    public void setPoder() {
        this.poder = random.nextInt(10, 30);
    }

    public int getPoder() {
        return poder;
    }

    public void setAtaque() {
        this.ataque = random.nextInt(5, 15);
    }

    public int getAtaque() {
        return this.ataque;
    }

    public void setDefesa() {
        this.defesa = random.nextInt(5, 15);
    }

    public int getDefesa() {
        return this.defesa;
    }

    public void setVelocidade() {
        this.velocidade = random.nextInt(1, 10);
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVidaAleatoria() {
        this.vida = random.nextInt(200, 400);
    }

    public int getVidaAleatoria() {
        return this.vida;
    }

    public void setVida(int novaVida) {
        this.vida = novaVida;
    }

    public int getVida() {
        return this.vida;
    }

    public String toString() {
        return String.format("\nPoder: %d\nAtaque: %d\nDefesa: %d\nVelocidade: %d\nVida: %d",
        getPoder(),
        getAtaque(),
        getDefesa(),
        getVelocidade(),
        getVidaAleatoria());
    }
    public int atacar(int defesaOponente) {
        int dano = poder * ataque / defesaOponente;
        // System.out.printf("O dano causado foi de: %d, com o poder: %d * ataque: %d / defesa: %d.\n", dano, poder, ataque, defesaOponente);
        return dano; 
    }

    public String getNome() {
        return null;
    }

    // public void utilizarEspecial();

}
