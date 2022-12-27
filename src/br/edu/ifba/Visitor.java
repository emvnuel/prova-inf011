package br.edu.ifba;

//Visitor
//Decorator: Component
public interface Visitor {

    String visitLivro(Livro livro);
    String visitAlbum(Album album);
    String getHeader();
    String getFooter();
    String getSeparator();
}
