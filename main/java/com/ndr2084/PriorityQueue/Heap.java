package com.ndr2084.PriorityQueue;

import java.util.ArrayList;

public interface Heap {
    public boolean push(int priority, String value);
    public Node pop();
    public Node peek();
    public boolean isEmpty();
    public int size();
    public void Heapify(ArrayList<Node> list, int size, int index);
}
