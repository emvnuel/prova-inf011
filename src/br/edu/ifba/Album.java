package br.edu.ifba;

//Visitor: Concrete element
//Composite: Leaf
public class Album extends Obra {

    private String gravadora;
    private String estudio;
    private String autor;
    private Integer duracao;

    public Album(String titulo,
                 Integer ano,
                 Double avaliacao,
                 String gravadora,
                 String estudio,
                 String autor,
                 Integer duracao) {
        super(titulo, ano, avaliacao);
        this.gravadora = gravadora;
        this.estudio = estudio;
        this.autor = autor;
        this.duracao = duracao;
    }

    public String getGravadora() {
        return gravadora;
    }

    public String getEstudio() {
        return estudio;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getDuracao() {
        return duracao;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitAlbum(this);
    }

}
