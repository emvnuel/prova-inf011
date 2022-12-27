package br.edu.ifba;

public class SeparadorDecorator extends BaseDecorator {

    @Override
    public String visitAlbum(Album album) {
        return super.visitAlbum(album) + "\n************************************************";
    }

    @Override
    public String visitLivro(Livro livro) {
        return super.visitLivro(livro) + "\n************************************************";
    }
}
