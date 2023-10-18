

import java.util.Random;

public class Elemento {
    static Random random = new Random();

    private int poder;
    protected int ataque;
    private int defesa;
    private int velocidade;
    private int vida;

    public Object toString;

    public Elemento() {
        setPoder();
        setAtaque();
        setDefesa();
        setVelocidade();
        setVida(ataque);
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

    public void setVida(int vidaPersonagem2) {
        this.vida = random.nextInt(200, 400);
    }

    public int getVida() {
        return this.vida;
    }
    
    public String toString() {
        return String.format("Poder: %d, Ataque: %d, Defesa: %d, Velocidade: %d, Vida: %d",
        getPoder(),
        getAtaque(),
        getDefesa(),
        getVelocidade(),
        getVida());
    }
    public int atacar() {
        int dano = poder * ataque / defesa;
        System.out.printf("O dano causado foi de: %d, com o poder: %d * ataque: %d / defesa: %d.\n", dano, poder, ataque, defesa);
        return dano; 
    }

    public String getNome() {
        return null;
    }

    // public void utilizarEspecial();

}
