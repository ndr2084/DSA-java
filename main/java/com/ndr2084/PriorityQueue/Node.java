package com.ndr2084.PriorityQueue;

public class Node {
    private int priority = 0;
    private String value;

    public Node(int priority, String value){
        this.priority = priority;
        this.value = value;
    }

    public int getPriority(){
        return this.priority;
    }

    public String getValue(){
        return this.value;
    }
    }
