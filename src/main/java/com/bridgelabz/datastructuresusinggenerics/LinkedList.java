package com.bridgelabz.datastructuresusinggenerics;

public class LinkedList<K> {
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

    //Function To Pop First Node from Linked List
    public INode popFirstNode() {
        INode tempNode = this.headNode;
        this.headNode = headNode.getNext();
        return tempNode;
    }

    //Function To Pop Last Node from Linked List
    public INode popLastNode() {
        INode tempNode = this.headNode;
        while (!tempNode.getNext().equals(tailNode)) {
            tempNode = tempNode.getNext();
        }
        this.tailNode = tempNode;
        tempNode = tempNode.getNext();
        tailNode.setNext(null);
        return tempNode;
    }

    public INode searchForNode(INode keyNode) {
        if (this.headNode.equals(keyNode))
            return this.headNode;

        INode tempNode = headNode;
        while (tempNode != null) {
            tempNode = tempNode.getNext();
            if (tempNode.equals(keyNode))
                return tempNode;
        }
        return null;
    }


}
