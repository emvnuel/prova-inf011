package br.edu.ifba;

//Decorator: Base Decorator
public class BaseDecorator implements Visitor {

    protected Visitor visitor;

    public BaseDecorator() {
    }

    public BaseDecorator(Visitor visitor) {
        this.visitor = visitor;
    }

    @Override
    public String visitLivro(Livro livro) {
        return visitor.visitLivro(livro);
    }

    @Override
    public String visitAlbum(Album album) {
        return visitor.visitAlbum(album);
    }

    @Override
    public String getHeader() {
        return visitor.getHeader();
    }

    @Override
    public String getFooter() {
        return visitor.getFooter();
    }

    @Override
    public String getSeparator() {
        return visitor.getSeparator();
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }
}
