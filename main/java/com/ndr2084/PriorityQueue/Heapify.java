package com.ndr2084.PriorityQueue;

import java.util.ArrayList;
public class Heapify <T extends Comparable<? super T>>{

    private ArrayList<T>  deepCopy_HeapArray(ArrayList<T> original) {
        ArrayList<T> deepCopyList = new ArrayList<T>();
        return deepCopyList;
    }

    public ArrayList<T> minHeapify(ArrayList<T> list){
        ArrayList<T> tempArray = deepCopy_HeapArray(list);
        return tempArray;
    }
    public ArrayList<T> maxHeapify(ArrayList<T> list) {
        ArrayList<T> tempArray = deepCopy_HeapArray(list);
        return tempArray;
    }
}
