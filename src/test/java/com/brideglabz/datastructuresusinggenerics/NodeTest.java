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
        Node<Integer> myFirstNode = new Node<>(56);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.add(myFirstNode);
        linkedList.add(mySecondNode);
        linkedList.add(myThirdNode);
        boolean result = linkedList.headNode.equals(myThirdNode) && linkedList.headNode.getNext().equals(mySecondNode)
                && linkedList.tailNode.equals(myFirstNode);
        Assert.assertTrue(result);
    }
}
