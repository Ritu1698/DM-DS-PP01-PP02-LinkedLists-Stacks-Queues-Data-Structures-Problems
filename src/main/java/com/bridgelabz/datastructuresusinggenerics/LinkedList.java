package com.bridgelabz.datastructuresusinggenerics;

public class LinkedList {
    public INode headNode;
    public INode tailNode;

    //Constructor
    public LinkedList() {
        this.headNode = null;
        this.tailNode = null;
    }

    //Function To Add Node to Linked List
    public void add(INode newNode) {

        if (this.tailNode == null) {
            this.tailNode = newNode;
        }
        if (this.headNode == null) {
            this.headNode = newNode;
        } else {
            INode tempNode = this.headNode;
            this.headNode = newNode;
            this.headNode.setNext(tempNode);
        }
    }

}
