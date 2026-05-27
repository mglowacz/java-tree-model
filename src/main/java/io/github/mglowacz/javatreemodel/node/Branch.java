package io.github.mglowacz.javatreemodel.node;

import io.github.mglowacz.javatreemodel.foliage.FoliageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.String.format;

public class Branch implements Node {
    private static final Random RANDOM = new Random();
    private int age = 0;
    private double length = 0;
    private final List<Node> nodes = new ArrayList<>();

    public void grow(FoliageFactory foliageFactory) {
        age++;
        length += 0.5;

        //grow children
        for (Node n : nodes) {
            n.grow(foliageFactory);
        }

        //born new
        if (age <= 3 && RANDOM.nextDouble() < 0.6) {
            nodes.add(new Branch());
        }
        if (age <= 5 && RANDOM.nextDouble() < 0.7) {
            nodes.add(foliageFactory.create());
        }
    }

    @Override
    public String toDisplay(int indent) {
        String pad = "  ".repeat(indent);
        StringBuilder sb = new StringBuilder();
        sb.append(pad).append(format("Branch (len=%.1f)\n", length));
        for (Node n : nodes) {
            sb.append(n.toDisplay(indent + 1));
        }
        return sb.toString();
    }
}
