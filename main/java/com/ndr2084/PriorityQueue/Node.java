package com.ndr2084.PriorityQueue;

public class Node <P extends Comparable<P>, V>  {
    P priority;
    V value;

    public Node(P priority, V value) {
        this.priority = priority;
        this.value = value;
    }

    public int compareTo(Node<P, V> o) {
        return priority.compareTo(o.priority);

    }
}
