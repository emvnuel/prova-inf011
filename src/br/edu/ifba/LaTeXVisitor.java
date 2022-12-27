package br.edu.ifba;

//Visitor: Concrete Visitor
//Decorator: Concrete Component
public class LaTeXVisitor implements Visitor {

    @Override
    public String visitLivro(Livro livro) {
        return String.format("%% %s\n" +
                "\\textbf{%s}\n" +
                "\\emph{%s (%d}", livro.getTitulo(), livro.getTitulo(), livro.getAutor(), livro.getAno());
    }

    @Override
    public String visitAlbum(Album album) {
        return String.format("%% %s\n" +
                "\\textbf{%s}\n" +
                "\\emph{%s %d}", album.getTitulo(), album.getTitulo(), album.getAutor(), album.getAno());
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
