package io.github.mglowacz.javatreemodel.foliage;

public class ConiferousFoliageFactory implements FoliageFactory{
    @Override
    public Foliage create() {
        return new Needle();
    }
}
