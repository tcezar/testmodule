package ru.tcezar.books.algorithms.arrays;

import java.util.Arrays;

/**
 * Created by nat on 22.10.17.
 */
public class Rotation {
    public static int [] leftRotation(int [] array, int count){
        for(int i = 0; i<count-1; i++){
//            System.out.println(">>i="+i+" "+Arrays.toString(array));
            int tmp = array[0];
            for(int j = 0;j<array.length-1;j++){
                array[j] = array[j+1];
//                System.out.println("<<j="+j+" "+Arrays.toString(array));
            }
            array[array.length-1] = tmp;
        }
        return array;
    }
}
