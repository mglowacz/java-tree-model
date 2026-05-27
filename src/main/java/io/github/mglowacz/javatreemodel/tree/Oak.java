package io.github.mglowacz.javatreemodel.tree;

import io.github.mglowacz.javatreemodel.foliage.FoliageFactory;

public class Oak extends DeciduousTree {

    public static Tree create() {
        return new Oak();
    }

    @Override
    public void grow(FoliageFactory foliageFactory) {

    }
}
