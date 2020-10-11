package com.brideglabz.datastructuresusinggenerics;

import com.bridgelabz.datastructuresusinggenerics.INode;
import com.bridgelabz.datastructuresusinggenerics.LinkedList;
import com.bridgelabz.datastructuresusinggenerics.Node;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NodeTest {
    @Test
    public void givenThreeNumbers_whenLinkedTogether_shouldReturnTrue() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        boolean result = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
        assertTrue(result);
    }

    @Test
    public void givenThreeNumbers_whenAddedOneAfterAnother_ShouldReturnHeadAtTop() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(firstNode);
        linkedList.addNode(secondNode);
        linkedList.addNode(thirdNode);
        boolean result = linkedList.getHead().equals(thirdNode) && linkedList.getHead().getNext().equals(secondNode)
                && linkedList.getTail().equals(firstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenThreeNumbers_whenAppendedOneAfterAnother_ShouldReturnHeadAtBottom() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.appendNode(firstNode);
        linkedList.appendNode(secondNode);
        linkedList.appendNode(thirdNode);
        boolean result = linkedList.getHead().equals(firstNode) && linkedList.getHead().getNext().equals(secondNode)
                && linkedList.getTail().equals(thirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenThreeNumbers_whenInsertAfterAPosition_ShouldReturnThatNodeAtThatPosition() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(70);
        Node<Integer> nodeBetweenFirstAndSecondNode = new Node<>(30);
        LinkedList linkedList = new LinkedList();
        linkedList.appendNode(firstNode);
        linkedList.appendNode(secondNode);
        linkedList.insertNodeAtPosition(firstNode, nodeBetweenFirstAndSecondNode);
        boolean result = linkedList.getHead().equals(firstNode) && linkedList.getHead().getNext().equals(nodeBetweenFirstAndSecondNode) && linkedList.getTail().equals(secondNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenThreeNumbers_whenPoppedFirstNode_ShouldReturnHeadAtSecondNode() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.appendNode(firstNode);
        linkedList.appendNode(secondNode);
        linkedList.appendNode(thirdNode);
        linkedList.popFirstNode();
        boolean result = linkedList.getHead().equals(secondNode) && linkedList.getHead().getNext().equals(thirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenThreeNumbers_whenPoppedLastNode_ShouldReturnTailAtSecondLastNode() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.appendNode(firstNode);
        linkedList.appendNode(secondNode);
        linkedList.appendNode(thirdNode);
        linkedList.popLastNode();
        boolean result = linkedList.getHead().equals(firstNode) && linkedList.getHead().getNext().equals(linkedList.getTail());
        Assert.assertTrue(result);
    }

    @Test
    public void givenThreeNumbers_whenSearchedForAnyNode_ShouldReturnThatNodeIfPresent() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.appendNode(firstNode);
        linkedList.appendNode(secondNode);
        linkedList.appendNode(thirdNode);
        INode tempNode = linkedList.searchForNode(30);
        Assert.assertEquals(secondNode, tempNode);
    }

    @Test
    public void givenThreeNumbers_whenNodeAfterSearchedNode_ShouldReturnThatNodeInLinkedList() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        Node<Integer> myNewNode = new Node<>(40);
        LinkedList linkedList = new LinkedList();
        linkedList.appendNode(firstNode);
        linkedList.appendNode(secondNode);
        linkedList.appendNode(thirdNode);
        linkedList.insertNodeAfterKeyPosition(30, myNewNode);
        boolean result = linkedList.getHead().equals(firstNode) && linkedList.getHead().getNext().equals(secondNode)
                && linkedList.getHead().getNext().getNext().equals(myNewNode)
                && linkedList.getTail().equals(thirdNode);
        assertTrue(result);
    }

    @Test
    public void givenThreeNumbers_whenLastElementDeleted_shouldShowDecreaseInSize() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(40);
        Node<Integer> fourthNode = new Node<>(70);
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.appendNode(firstNode);
        linkedList.appendNode(secondNode);
        linkedList.appendNode(thirdNode);
        linkedList.appendNode(fourthNode);
        linkedList.deleteNode(40);
        int result = linkedList.getSizeOfLinkedList();
        assertEquals(3,result);
    }

}
