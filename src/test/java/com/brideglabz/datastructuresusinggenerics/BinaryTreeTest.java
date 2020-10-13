package com.brideglabz.datastructuresusinggenerics;

import com.bridgelabz.datastructuresusinggenerics.BinaryTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {

    BinaryTree<Integer> binaryTreeMany = null;
    @Before
    public void givenManyNumbers_whenAddedToBST_ToReduceRedundancy() {
        binaryTreeMany = new BinaryTree<>();
        binaryTreeMany.add(56);
        binaryTreeMany.add(30);
        binaryTreeMany.add(70);
        binaryTreeMany.add(22);
        binaryTreeMany.add(40);
        binaryTreeMany.add(60);
        binaryTreeMany.add(95);
        binaryTreeMany.add(11);
        binaryTreeMany.add(65);
        binaryTreeMany.add(3);
        binaryTreeMany.add(16);
        binaryTreeMany.add(63);
        binaryTreeMany.add(67);
    }

    @Test
    public void givenThreeNumbers_whenAddedToBST_shouldReturnHeightThree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        int sizeOfBinaryTree = binaryTree.getSize();
        Assert.assertEquals(3, sizeOfBinaryTree);
    }



    @Test
    public void givenManyNumbers_whenAddedToBST_shouldReturnHeightOfTree() {
        int sizeOfBinaryTree = binaryTreeMany.getSize();
        Assert.assertEquals(13, sizeOfBinaryTree);
    }

    @Test
    public void givenManyNumbers_whenAddedAndKeySearchedInBST_shouldReturnTrueIfPresent() {
        Assert.assertTrue(binaryTreeMany.search(3));
        Assert.assertFalse(binaryTreeMany.search(1));
    }

}
