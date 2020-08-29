package com.continuada.yugioh;

public class CartaMagica extends Carta{
    //As cartas magicas tem diferentes tipos de classificação
    //Cartas rapidas - São ativadas em resposta a uma ação do oponente
    //Cartas continuas - Após serem ativadas permanecem no campo para serem reutilizadas
    //Cartas comuns - São ativadas, aplicam o efeito e logo após são destruidas
    private String tipoAtivacao;

    public CartaMagica(String nome, String descricao, String tipoAtivacao) {
        super(nome, descricao);
        this.tipoAtivacao = tipoAtivacao;
    }

    @Override
    public Boolean ativarEfeito(Boolean status) {
        return status;
    }

    public String getTipoAtivacao() {
        return tipoAtivacao;
    }

    public void setTipoAtivacao(String tipoAtivacao) {
        this.tipoAtivacao = tipoAtivacao;
    }
}
