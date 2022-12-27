package br.edu.ifba;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

//Composite: composite
public class ExportadorObra implements Element {

    private List<Element> children;
    private BaseDecorator decorator;
    private Visitor visitor;

    public ExportadorObra(Visitor visitor) {
        this.children = new ArrayList<>();
        this.visitor = visitor;
        this.decorator = new BaseDecorator(visitor);
    }

    public void decorate(BaseDecorator decorator) {
        this.decorator = decorator;
        decorator.setVisitor(visitor);
    }

    public void addChild(Element element) {
        children.add(element);
    }

    public void removeChild(Element element) {
        children.remove(element);
    }

    public List<Element> getChildren() {
        return children;
    }

    @Override
    public String accept(Visitor visitor) {
        StringJoiner content = new StringJoiner(visitor.getSeparator());
        for (Element element : children) {
            content.add(element.accept(decorator));
        }
        return this.visitor.getHeader() + content + this.visitor.getFooter();
    }

    public String getExportedData() {
        return this.accept(this.visitor);
    }
}
