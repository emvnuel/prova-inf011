package br.edu.ifba;

//Visitor: Element
//Composite: Component
public interface Element {
    String accept(Visitor visitor);
}
