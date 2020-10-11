package com.bridgelabz.datastructuresusinggenerics;

public class Node<T> implements INode<T> {
    private T key;
    private INode<T> next;

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
    public INode<T> getNext() {
        return next;
    }

    // Setter for Next
    public void setNext(INode<T> next) {
        this.next = next;
    }
}
