package com.brideglabz.datastructuresusinggenerics;
import com.bridgelabz.datastructuresusinggenerics.Node;
import com.bridgelabz.datastructuresusinggenerics.Stack;
import org.junit.Assert;
import org.junit.Test;

public class StackTest {

    @Test
    public void givenThreeNumbers_whenPushedToStack_shouldHaveHeadAtTopTailAtBottom() {
        Node<Integer> thirdNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> firstNode = new Node<>(70);

        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(firstNode);
        myStack.push(secondNode);
        myStack.push(thirdNode);
        boolean result = myStack.linkedList.getHead().equals(thirdNode)
                && myStack.linkedList.getHead().getNext().equals(secondNode)
                && myStack.linkedList.getTail().equals(firstNode);

        Assert.assertTrue(result);
    }
}
