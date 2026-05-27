package io.github.mglowacz.javatreemodel.node;

import io.github.mglowacz.javatreemodel.foliage.FoliageFactory;

import static java.lang.String.format;

public class Trunk implements Growable {
    private double diameter = 0.5;
    private Branch rootBranch;

    @Override
    public void grow(FoliageFactory foliageFactory) {
        diameter += 0.3;
        if (rootBranch == null) {
            rootBranch = new Branch();
        }
        rootBranch.grow(foliageFactory);
    }

    public String toDisplay(int indent) {
        String pad = "  ".repeat(indent);
        String trunk = pad + format("Trunk (diam=%.1f)\n", diameter);
        return rootBranch != null
                ? trunk + rootBranch.toDisplay(indent + 1)
                : trunk;
    }
}
