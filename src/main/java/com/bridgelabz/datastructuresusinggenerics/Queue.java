package com.bridgelabz.datastructuresusinggenerics;

public class Queue<K> {
    public LinkedList<K> linkedList;

    // Constructor
    public Queue() {
        linkedList = new LinkedList<K>();
    }

    // Enqueue
    public void enqueue(INode<K> newNode) {
        linkedList.appendNode(newNode);
    }

}
