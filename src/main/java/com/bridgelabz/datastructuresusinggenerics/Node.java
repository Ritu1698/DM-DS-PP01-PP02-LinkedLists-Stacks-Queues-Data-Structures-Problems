package com.bridgelabz.datastructuresusinggenerics;

public class Node<T> {
    private T key;
    private Node next;

    // Parameterized Constructor
    public Node(T key) {
        this.key = null;
        this.next = null;
    }

    // Getter for Key
    public T getKey() {
        return key;
    }

    // Setter for Key
    public void setKey(T key) {
        this.key = key;
    }

    // Getter for Next
    public Node getNext() {
        return next;
    }

    // Setter for Next
    public void setNext(Node next) {
        this.next = next;
    }
}
