package ru.tcezar.books.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nat on 17.10.17.
 */
public class Sorting {
    public static <D extends Number> List<D> insertionSort(List<D> list){
        int n= list.size();
        for(int i=1;i<n;i++)
            for(int j=i;j>0 && list.get(j-1).doubleValue()>list.get(j).doubleValue();j--){
                D temp = list.get(j-1);
                list.set(j-1,list.get(j));
                list.set(j,temp);
            }
        return list;
    }
}
