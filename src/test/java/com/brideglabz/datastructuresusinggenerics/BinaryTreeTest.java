package com.brideglabz.datastructuresusinggenerics;

import com.bridgelabz.datastructuresusinggenerics.BinaryTree;
import com.bridgelabz.datastructuresusinggenerics.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void givenThreeNumbers_whenAddedToBST_shouldReturnHeightThree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        int sizeOfBinaryTree = binaryTree.getSize();
        Assert.assertEquals(3, sizeOfBinaryTree);
    }
}
