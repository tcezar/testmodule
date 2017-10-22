package ru.tcezar.testmodule.test;

import junit.framework.TestCase;
import org.junit.Test;
import ru.tcezar.books.algorithms.generator.Generator;
import ru.tcezar.books.algorithms.sorting.Sorting;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nat on 15.10.17.
 * for student test
 */
public class SimpleTest extends TestCase {
    @Test
    public void test1(){
        System.out.println("succes");
    }
    public void test2(){
        List<Double> doubles = Generator.generateArrays(1000);
        System.out.println(Arrays.toString(doubles.toArray()));
        List<Double> insertionSort = Sorting.insertionSort(doubles);
        System.out.println(Arrays.toString(insertionSort.toArray()));
        System.out.println("succes");
    }
}
