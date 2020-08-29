package com.continuada.yugioh;

public abstract class Carta {
    //Nome - é o nome da carta
    //Descrição - é o texto que fica geralmente em baixo da carta
    private String nome, descricao;

    public Carta(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    //Se o efeito vai ou não ser ativado
    public abstract Boolean ativarEfeito(Boolean status);

    @Override
    public String toString() {
        return "Nome: "+ this.nome +"\nDescrição: "+descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
