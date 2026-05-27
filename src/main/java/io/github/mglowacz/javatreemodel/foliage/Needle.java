package io.github.mglowacz.javatreemodel.foliage;

public class Needle implements Foliage {
    @Override
    public String toDisplay(int indent) {
        return "  ".repeat(indent) + "Needle\n";
    }
}
