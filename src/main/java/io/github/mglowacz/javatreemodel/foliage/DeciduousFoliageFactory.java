package io.github.mglowacz.javatreemodel.foliage;

public class DeciduousFoliageFactory implements FoliageFactory {
    @Override
    public Foliage create() {
        return new Leaf();
    }
}
