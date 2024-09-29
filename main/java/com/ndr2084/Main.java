package com.ndr2084;
import com.ndr2084.PriorityQueue.Heapify;
import com.ndr2084.PriorityQueue.Node;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        ArrayList<Node> array = new ArrayList<>();
        ArrayList<Node> heapArray = new ArrayList<>();
        heapArray = Heapify.maxHeapify(array);

    }
}