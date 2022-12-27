package br.edu.ifba;

//Visitor: Concrete Visitor
//Decorator: Concrete Component
public class XMLVisitor implements Visitor {
    @Override
    public String visitLivro(Livro livro) {
        return String.format(
                "\t<livro titulo = \"%s\" ano = \"%d\">\n" +
                    "\t\t<avaliacao>%s</avaliacao>\n" +
                    "\t\t<editora>%s</editora>\n" +
                    "\t\t<idioma>%s</idioma>\n" +
                    "\t\t<autor>%s</autor>\n" +
                    "\t\t<num_paginas>%d</num_paginas>\n" +
                "\t</livro>\n",
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
                "\t<album titulo = \"%s\" ano = \"%d\">\n" +
                    "\t\t<avaliacao>%s</avaliacao>\n" +
                    "\t\t<gravadora>%s</gravadora>\n" +
                    "\t\t<estudio>%s</estudio>\n" +
                    "\t\t<autor>%s</autor>\n" +
                    "\t\t<duracao>%d</duracao>\n" +
                "\t</album>\n",
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
        return "<obras>\n";
    }

    @Override
    public String getFooter() {
        return "</obras>";
    }

    @Override
    public String getSeparator() {
        return "";
    }
}
