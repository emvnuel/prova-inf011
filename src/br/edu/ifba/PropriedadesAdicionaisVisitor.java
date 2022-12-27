package br.edu.ifba;

//Visitor: Concrete Visitor
//Decorator: Concrete Component
public class PropriedadesAdicionaisVisitor implements Visitor {
    @Override
    public String visitLivro(Livro livro) {
        return String.format("\nEditora: %s\n" +
                "Numero de Páginas: %d\n" +
                "Avaliação: %s", livro.getEditora(), livro.getNumeroPaginas(), livro.getAvaliacao());
    }

    @Override
    public String visitAlbum(Album album) {
        return String.format("\nGravadora: %s\n" +
                "Estúdio: %s\n" +
                "Avaliação: %s", album.getGravadora(), album.getEstudio(), album.getAvaliacao());
    }

    @Override
    public String getHeader() {
        return "";
    }

    @Override
    public String getFooter() {
        return "";
    }

    @Override
    public String getSeparator() {
        return "\n";
    }
}
