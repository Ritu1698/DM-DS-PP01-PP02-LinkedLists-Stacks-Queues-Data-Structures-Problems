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
    // Peek stack
    public INode peek() {
        return linkedList.getHead();
    }

    // Pop from stack
    public INode popTopNode() {
        if (linkedList.getSizeOfLinkedList() > 0)
            return linkedList.popFirstNode();
        else {
            System.out.println("Stack is empty!");
            return null;
        }
    }


}