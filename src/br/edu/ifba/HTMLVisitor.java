package br.edu.ifba;

//Visitor: Concrete Visitor
//Decorator: Concrete Component
public class HTMLVisitor implements Visitor {
    @Override
    public String visitLivro(Livro livro) {
        return String.format("\n<!-- %s -->\n" +
                "<bold>%s</bold>\n" +
                "<italic>%s (%d)</italic>", livro.getTitulo(), livro.getTitulo(), livro.getAutor(), livro.getAno());
    }

    @Override
    public String visitAlbum(Album album) {
        return String.format("\n<!-- %s -->\n" +
                "<bold>%s</bold>\n" +
                "<italic>%s %d</italic>", album.getTitulo(), album.getTitulo(), album.getAutor(), album.getAno());
    }

    @Override
    public String getHeader() {
        return "<HTML>\n" +
               "<HEAD></HEAD>\n" +
               "<BODY>";
    }

    @Override
    public String getFooter() {
        return "\n</BODY>";
    }

    @Override
    public String getSeparator() {
        return "";
    }
}
