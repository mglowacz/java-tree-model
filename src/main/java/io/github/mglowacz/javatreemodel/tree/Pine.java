package io.github.mglowacz.javatreemodel.tree;

import io.github.mglowacz.javatreemodel.foliage.FoliageFactory;

public class Pine extends ConiferousTree {

    public static Tree create() {
        return new Pine();
    }

    @Override
    public void grow(FoliageFactory foliageFactory) {

    }
}
