package com.brideglabz.datastructuresusinggenerics;

import com.bridgelabz.datastructuresusinggenerics.Node;
import com.bridgelabz.datastructuresusinggenerics.INode;
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

    @Test
    public void givenThreeNumbers_whenPeekingIntoStack_shouldReturnFirstElement() {
        Node<Integer> myThirdNode = new Node<>(56);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myFirstNode = new Node<>(70);
        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode<Integer> peekNode = myStack.peek();
        Assert.assertEquals(myThirdNode, peekNode);
    }

    @Test
    public void given3Numbers_whenPoppedFromStackTillEmpty_shouldReturnNull() {
        Node<Integer> myThirdNode = new Node<>(56);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myFirstNode = new Node<>(70);
        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.popTopNode();
        myStack.popTopNode();
        myStack.popTopNode();
        Assert.assertEquals(null, myStack.linkedList.getHead());
    }


}
