package io.github.mglowacz.javatreemodel.foliage;

public class Leaf implements Foliage {
    @Override
    public String toDisplay(int indent) {
        return "  ".repeat(indent) + "Leaf\n";
    }
}
