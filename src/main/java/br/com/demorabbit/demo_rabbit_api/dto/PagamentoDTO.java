package br.com.demorabbit.demo_rabbit_api.dto;

public class PagamentoDTO {

    private String nome;
    private String numeroCartao;
    private String valor;
    private String descricao;

    public PagamentoDTO() {
    }

    public PagamentoDTO(String nome, String numeroCartao, String valor, String descricao) {
        this.nome = nome;
        this.numeroCartao = numeroCartao;
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "PagamentoDTO [descricao=" + descricao + ", nome=" + nome + ", numeroCartao=" + numeroCartao + ", valor="
                + valor + "]";
    }

}
