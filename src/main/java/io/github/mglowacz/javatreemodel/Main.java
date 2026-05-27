package io.github.mglowacz.javatreemodel;

import io.github.mglowacz.javatreemodel.tree.Oak;
import io.github.mglowacz.javatreemodel.tree.Pine;
import io.github.mglowacz.javatreemodel.tree.Tree;

public class Main {
    public static void main(String[] args) {
        Tree pine = Pine.create();
        Tree oak = Oak.create();

        System.out.println(pine);
        System.out.println(oak);

        for (int i = 1; i <= 7; i++) {
            pine.grow();
            oak.grow();
            System.out.println("=== Year " + i + " ===");
            System.out.println(pine);
            System.out.println(oak);
        }
    }
}
