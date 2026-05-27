package io.github.mglowacz.javatreemodel.tree;

import io.github.mglowacz.javatreemodel.foliage.FoliageFactory;
import io.github.mglowacz.javatreemodel.node.Growable;
import io.github.mglowacz.javatreemodel.node.Trunk;

import static java.lang.String.format;

public sealed abstract class Tree implements Growable permits ConiferousTree, DeciduousTree {
    protected int age = 0;
    protected Trunk trunk = new Trunk();
    protected FoliageFactory foliageFactory = createFoliageFactory();

    public void grow() {
        age++;
        trunk.grow(foliageFactory);
    }

    protected abstract FoliageFactory createFoliageFactory();

    @Override
    public String toString() {
        return format("%s (age=%d)\n", getClass().getSimpleName(), age)
                + trunk.toDisplay(1);
    }
}
