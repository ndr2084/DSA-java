package com.ndr2084.PriorityQueue;

import java.util.ArrayList;

public class HeapFunctions implements Heap {
    ArrayList<Node> heap;
    @Override
    public boolean push(int priority, String value) {
        Node node = new Node(priority, value);
        heap.add(node);
        return true;
    }

    @Override
    public Node pop() {
        return null;
    }

    @Override
    public Node peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void Heapify(ArrayList<Node> list, int size, int index) {

    }
}
