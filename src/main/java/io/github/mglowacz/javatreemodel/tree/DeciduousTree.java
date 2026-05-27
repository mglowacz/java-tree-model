package io.github.mglowacz.javatreemodel.tree;

import io.github.mglowacz.javatreemodel.foliage.DeciduousFoliageFactory;
import io.github.mglowacz.javatreemodel.foliage.FoliageFactory;

public abstract non-sealed class DeciduousTree extends Tree {
    @Override
    protected FoliageFactory createFoliageFactory() {
        return new DeciduousFoliageFactory();
    }
}
