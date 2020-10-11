package com.bridgelabz.datastructuresusinggenerics;

public class Stack<K> {
    public LinkedList<K> linkedList;

    // Constructor
    public Stack() {
        linkedList = new LinkedList<K>();
    }

    // Push to the stack
    public void push(INode<K> newNode) {
        linkedList.addNode(newNode);
    }


}