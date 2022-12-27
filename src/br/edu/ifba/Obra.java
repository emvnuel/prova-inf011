package br.edu.ifba;

public abstract class Obra implements Element {

    private String titulo;
    private Integer ano;
    private Double avaliacao;

    public Obra(String titulo, Integer ano, Double avaliacao) {
        this.titulo = titulo;
        this.ano = ano;
        this.avaliacao = avaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

}
