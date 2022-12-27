package br.edu.ifba;

public class Main {

    public static void main(String[] args) {
        new Main().run2();
    }

    private void run1() {
        Livro livro = new Livro("Rinha de galos",
                2021,
                4.6,
                "Moinhos",
                "Português",
                "María Fernanda Ampuero",
                112);
        Album album = new Album("Acabou Chorare",
                1972,
                4.9,
                "Som Livre",
                "Somil",
                "Novos Baianos",
                2160);

        Visitor visitor = new JsonVisitor();

        ExportadorObra exportador = new ExportadorObra(visitor);
        exportador.addChild(livro);
        exportador.addChild(album);
        System.out.println(exportador.getExportedData());
    }

    private void run2() {
        Livro livro = new Livro("Rinha de galos",
                2021,
                4.6,
                "Moinhos",
                "Português",
                "María Fernanda Ampuero",
                112);
        Album album = new Album("Acabou Chorare",
                1972,
                4.9,
                "Som Livre",
                "Somil",
                "Novos Baianos",
                2160);

        Visitor visitor = new HTMLVisitor();

        ExportadorObra exportador = new ExportadorObra(visitor);
        exportador.addChild(livro);
        exportador.addChild(album);
        exportador.decorate(new RelatorioCompletoDecorator());
//        exportador.decorate(new SeparadorDecorator());
        System.out.println(exportador.getExportedData());
    }

}
