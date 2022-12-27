package br.edu.ifba;

//Visitor: Concrete Visitor
//Decorator: Concrete Component
public class JsonVisitor implements Visitor {

    @Override
    public String visitLivro(Livro livro) {
        return String.format(
                "\n\t{\n" +
                "\t\t\"titulo\": \"%s\",\n" +
                "\t\t\"ano\": %d,\n" +
                "\t\t\"avaliacao\": %s,\n" +
                "\t\t\"editora\": \"%s\",\n" +
                "\t\t\"idioma\": \"%s\",\n" +
                "\t\t\"autor\": \"%s\",\n" +
                "\t\t\"num_paginas\": %d\n" +
                "\t}",
                livro.getTitulo(),
                livro.getAno(),
                livro.getAvaliacao(),
                livro.getEditora(),
                livro.getIdioma(),
                livro.getAutor(),
                livro.getNumeroPaginas());
    }

    @Override
    public String visitAlbum(Album album) {
        return String.format(
                "\n\t{\n" +
                " \t\t\"titulo\": \"%s\",\n" +
                " \t\t\"ano\": %d,\n" +
                " \t\t\"avaliacao\": %s,\n" +
                " \t\t\"gravadora\": \"%s\",\n" +
                " \t\t\"estudio\": \"%s\",\n" +
                " \t\t\"autor\": \"%s\",\n" +
                " \t\t\"duracao\": %d\n" +
                "\t}",
                album.getTitulo(),
                album.getAno(),
                album.getAvaliacao(),
                album.getGravadora(),
                album.getEstudio(),
                album.getAutor(),
                album.getDuracao());
    }

    @Override
    public String getHeader() {
        return "[";
    }

    @Override
    public String getFooter() {
        return "\n]";
    }

    @Override
    public String getSeparator() {
        return ",";
    }
}
