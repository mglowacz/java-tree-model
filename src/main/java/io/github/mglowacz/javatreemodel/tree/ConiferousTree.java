package io.github.mglowacz.javatreemodel.tree;

import io.github.mglowacz.javatreemodel.foliage.ConiferousFoliageFactory;
import io.github.mglowacz.javatreemodel.foliage.FoliageFactory;

public abstract non-sealed class ConiferousTree extends Tree {
    @Override
    protected FoliageFactory createFoliageFactory() {
        return new ConiferousFoliageFactory();
    }
}
