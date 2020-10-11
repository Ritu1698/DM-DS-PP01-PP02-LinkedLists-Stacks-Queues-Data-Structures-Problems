package com.brideglabz.datastructuresusinggenerics;

import com.bridgelabz.datastructuresusinggenerics.LinkedList;
import com.bridgelabz.datastructuresusinggenerics.Node;
import org.junit.Assert;
import org.junit.Test;

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
        boolean result = linkedList.headNode.equals(thirdNode) && linkedList.headNode.getNext().equals(secondNode)
                && linkedList.tailNode.equals(firstNode);
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
        boolean result = linkedList.headNode.equals(firstNode) && linkedList.headNode.getNext().equals(secondNode)
                && linkedList.tailNode.equals(thirdNode);
        Assert.assertTrue(result);
    }
}
