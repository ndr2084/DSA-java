package com.ndr2084.PriorityQueue;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Heapify{

    private static ArrayList<Node> deepCopy_HeapArray(ArrayList<Node> original) {
        ArrayList<Node> deepCopyList = new ArrayList<Node>();
        for (Node node : original) {
            Node nodeCopy = new Node(node.getPriority(), node.getValue());
            deepCopyList.add(nodeCopy);
        }
        return deepCopyList;
    }

    public static ArrayList<Node> minHeapify(ArrayList<Node> list){
        ArrayList<Node> tempArray = deepCopy_HeapArray(list);
        return tempArray;
    }
    public static ArrayList<Node> maxHeapify(ArrayList<Node> list){
        ArrayList<Node> tempArray = deepCopy_HeapArray(list);
        return tempArray;
    }
}
