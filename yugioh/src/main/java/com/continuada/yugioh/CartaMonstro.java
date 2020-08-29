package com.continuada.yugioh;

public class CartaMonstro extends Carta{
    //São os pontos do monstro, geralmente ficam na parte inferior da carta.
    private Integer ataque, vida;

    public CartaMonstro(String nome, String descricao, Integer ataque, Integer vida) {
        super(nome, descricao);
        this.ataque = ataque;
        this.vida = vida;
    }

    @Override
    public Boolean ativarEfeito(Boolean status) {
        return status;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }
}
