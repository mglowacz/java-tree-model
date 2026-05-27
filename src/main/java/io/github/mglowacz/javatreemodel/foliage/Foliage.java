package io.github.mglowacz.javatreemodel.foliage;

import io.github.mglowacz.javatreemodel.node.Node;

public interface Foliage extends Node {
    @Override
    default void grow(FoliageFactory foliageFactory) {
        // empty because leafs and needles don't grow
    }
}
