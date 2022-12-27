package br.edu.ifba;

//Visitor: Concrete element
//Composite: Leaf
public class Livro extends Obra {

    private String editora;
    private String idioma;
    private String autor;
    private Integer numeroPaginas;

    public Livro(String titulo,
                 Integer ano,
                 Double avaliacao,
                 String editora,
                 String idioma,
                 String autor,
                 Integer numeroPaginas) {
        super(titulo, ano, avaliacao);
        this.editora = editora;
        this.idioma = idioma;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getEditora() {
        return editora;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitLivro(this);
    }
}
