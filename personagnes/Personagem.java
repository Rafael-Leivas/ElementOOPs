package personagnes;

import java.util.Random;

public class Personagem {
    Random random = new Random();

    private String nome;
    private int poder;
    private int ataque;
    private int defesa;
    private int velocidade;
    private int vida;

    public Personagem(String nome, int poder, int ataque, int defesa, int velocidade, int vida) {
        setNome(nome);
        setPoder(poder);
        setAtaque(ataque);
        setDefesa(defesa);
        setVelocidade(velocidade);
        setVida(vida);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPoder(int poder) {
        this.poder = random.nextInt(10, 30);
    }

    public int getPoder() {
        return this.poder;
    }

    public void setAtaque(int ataque) {
        this.ataque = random.nextInt(5, 15);
    }

    public int getAtaque() {
        return this.ataque;
    }

    public void setDefesa(int defesa) {
        this.defesa = random.nextInt(5, 15);
    }

    public int getDefesa() {
        return this.defesa;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = random.nextInt(1, 10);
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVida(int vida) {
        this.vida = random.nextInt(200, 400);
    }

    public int getVida() {
        return this.vida;
    }

    public String toString() {
        return String.format("Nome: %s, Poder: %d, Ataque: %d, Defesa: %d, Velocidade: %d, Vida: %d",
        getNome(),
        getPoder(),
        getAtaque(),
        getDefesa(),
        getVelocidade(),
        getVida());
    }
    
    public void atacar() {
        int dano = poder * ataque / defesa;
        System.out.printf("O dano causado foi de: %d, com o poder: %d * ataque: %d / defesa: %d.", dano, poder, ataque, defesa); 
    }

    public void superAtaque() {
        int dano = poder * ataque / defesa;
        System.out.printf("O dano causado foi de: %d, com o poder: %d * ataque: %d / defesa: %d.", dano, poder, ataque, defesa); 
    }
    
}
