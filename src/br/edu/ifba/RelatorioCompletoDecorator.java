package br.edu.ifba;

//Decorator: Concrete Decorator
public class RelatorioCompletoDecorator extends BaseDecorator {

    private Visitor propriedadesAdicionaisVisitor;

    public RelatorioCompletoDecorator() {
        this.propriedadesAdicionaisVisitor = new PropriedadesAdicionaisVisitor();
    }

    public RelatorioCompletoDecorator(Visitor visitor) {
        super(visitor);
        this.propriedadesAdicionaisVisitor = new PropriedadesAdicionaisVisitor();
    }

    @Override
    public String visitLivro(Livro livro) {
        return super.visitLivro(livro) + livro.accept(propriedadesAdicionaisVisitor);
    }

    @Override
    public String visitAlbum(Album album) {
        return super.visitAlbum(album) + album.accept(propriedadesAdicionaisVisitor);
    }

}
