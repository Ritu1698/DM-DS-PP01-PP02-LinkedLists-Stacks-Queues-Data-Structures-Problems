package com.brideglabz.datastructuresusinggenerics;

import org.junit.Test;
import com.bridgelabz.datastructuresusinggenerics.Node;
import com.bridgelabz.datastructuresusinggenerics.Queue;
import org.junit.Assert;


public class QueueTest {
    @Test
    public void given3Numbers_whenEnqueued_shouldPassStackCriteria() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(firstNode);
        queue.enqueue(secondNode);
        queue.enqueue(thirdNode);
        boolean result = queue.linkedList.getHead().equals(firstNode)
                && queue.linkedList.getHead().getNext().equals(secondNode)
                && queue.linkedList.getTail().equals(thirdNode);
        Assert.assertTrue(result);
    }
}
