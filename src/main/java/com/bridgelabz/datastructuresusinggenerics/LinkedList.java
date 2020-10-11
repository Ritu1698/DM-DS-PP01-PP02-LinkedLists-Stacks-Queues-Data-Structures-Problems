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
    public void addNode(INode newNode) {

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

    //Function To Append Node to Linked List
    public void appendNode(INode newNode) {
        if (this.tailNode == null) {
            this.tailNode = newNode;
        }

        if (this.headNode == null) {
            this.headNode = newNode;
        } else {
            INode tempNode = this.headNode;
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }

            tempNode.setNext(newNode);
            this.tailNode = newNode;

        }
    }

    //Function To Insert Node After a ParticularNode to Linked List
    public void insertNodeAtPosition(INode priorNode, INode newNode) {
        INode tempNode = priorNode.getNext();
        priorNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

}
