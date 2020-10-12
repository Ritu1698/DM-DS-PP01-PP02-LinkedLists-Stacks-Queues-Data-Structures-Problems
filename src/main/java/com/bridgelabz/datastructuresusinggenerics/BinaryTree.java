package com.bridgelabz.datastructuresusinggenerics;

public class BinaryTree <K extends Comparable<K>>{
    TreeNode<K> root;

    // Add Node to BST
    public void add(K key) {
        this.root = addRecursively(root, key);
    }

    // Recursive Function
    private TreeNode<K> addRecursively(TreeNode<K> current, K key) {
        if (current == null)
            return new TreeNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0)
            return current;
        if (compareResult < 0)
            current.left = addRecursively(current.left, key);
        else
            current.right = addRecursively(current.right, key);
        return current;
    }

    // Height Of BST
    public int getSize() {
        return this.getSizeRecursive(root);
    }

    // Recursive Function
    private int getSizeRecursive(TreeNode<K> current) {
        return current == null ? 0 : 1 + getSizeRecursive(current.left) + getSizeRecursive(current.right);
    }

    public boolean search(K key) {
        return searchRecursive(root, key) != null;
    }

    // Recursive Search function
    private TreeNode<K> searchRecursive(TreeNode<K> current, K key) {
        if (current == null)
            return null;
        else if (current.key.compareTo(key) == 0)
            return current;
        else if (current.key.compareTo(key) < 0)
            return searchRecursive(current.right, key);
        else
            return searchRecursive(current.left, key);
    }

}
