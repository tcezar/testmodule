package ru.tcezar.books.algorithms.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by nat on 17.10.17.
 */
public class Generator {
    static Random random = new Random();
    public static <N extends Number> List<N> generateArrays(int size) {
        List<N> list = new ArrayList<>();

        for (int i = 0; i<size; i++){
            list.add((N) Integer.valueOf(random.nextInt()));
        }
        return list;
    }
}
