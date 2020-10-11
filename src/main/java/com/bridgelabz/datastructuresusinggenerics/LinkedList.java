package com.bridgelabz.datastructuresusinggenerics;

public class LinkedList<K> {
    private INode<K> headNode;
    private INode<K> tailNode;
    private static int sizeOfLinkedList;

    // Getter for Head
    public INode getHead() {
        return headNode;
    }

    // Setter for Head
    public void setHead(INode headNode) {
        this.headNode = headNode;
    }

    // Getter for Tail
    public INode getTail() {
        return tailNode;
    }

    // Setter for Tail
    public void setTail(INode tail) {
        this.tailNode = tail;
    }

    // Function to find size of linked list
    public int getSizeOfLinkedList() {
        return sizeOfLinkedList;
    }

    // Constructor
    public LinkedList() {
        this.headNode = null;
        this.tailNode = null;
        this.sizeOfLinkedList = 0;
    }

    // Function to Add Node to Linked List
    public void addNode(INode newNode) {
        sizeOfLinkedList++;
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

    // Function to Append Node to Linked List
    public void appendNode(INode newNode) {
        sizeOfLinkedList++;
        if (this.tailNode == null) {
            this.tailNode = newNode;
        }
        if (this.headNode == null) {
            this.headNode = newNode;
        } else {
            this.tailNode.setNext(newNode);
            this.tailNode = newNode;
        }

    }

    // Function to Insert Node At Specific Position
    public void insertNodeAtPosition(INode firstNode, INode newNode) {
        sizeOfLinkedList++;
        INode tempNode = firstNode.getNext();
        firstNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    // Function to Pop First Node
    public INode popFirstNode() {
        sizeOfLinkedList--;
        INode tempNode = this.headNode;
        this.headNode = headNode.getNext();
        return tempNode;
    }

    // Function to Pop Last Node
    public INode popLastNode() {
        sizeOfLinkedList--;
        INode tempNode = this.headNode;
        while (!tempNode.getNext().equals(tailNode)) {
            tempNode = tempNode.getNext();
        }
        this.tailNode = tempNode;
        tempNode = tempNode.getNext();
        tailNode.setNext(null);
        return tempNode;
    }

    // Function to Search A node If Present
    public INode searchForNode(K key) {
        INode<K> tempNode = this.headNode;
        while (!tempNode.getKey().equals(key)) {
            tempNode = tempNode.getNext();
        }
        return tempNode;
    }

    // Function to search node with given key and then insert new node after
    public void insertNodeAfterKeyPosition(K key, INode newNode) {
        sizeOfLinkedList++;
        INode tempNode = searchForNode(key);
        insertNodeAtPosition(tempNode, newNode);
    }

    public INode deleteNode(K key) {
        sizeOfLinkedList--;
        INode deleteNode = searchForNode(key);
        INode tempNode = this.headNode;
        while (!tempNode.getNext().equals(deleteNode)) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(deleteNode.getNext());
        return deleteNode;
    }

}
