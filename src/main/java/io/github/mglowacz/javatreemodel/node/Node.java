package io.github.mglowacz.javatreemodel.node;

public interface Node extends Growable {
    String toDisplay(int indent);
}
