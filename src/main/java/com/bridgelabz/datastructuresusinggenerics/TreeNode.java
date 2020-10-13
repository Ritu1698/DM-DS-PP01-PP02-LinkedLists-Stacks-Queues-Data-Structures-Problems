package com.bridgelabz.datastructuresusinggenerics;

public class TreeNode<K extends Comparable<K>> {
    K key;
    TreeNode<K> right;
    TreeNode<K> left;

    //Parameterized Constructor
    public TreeNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
