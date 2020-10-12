package com.bridgelabz.datastructuresusinggenerics;

public class HashMap<K, V> {
    LinkedList<K> myLinkedList;

    // Constructor
    public HashMap() {
        this.myLinkedList = new LinkedList<>();
    }

    // Get value given Key
    public V get(K key) {
        MapNode<K, V> myMapNode = (MapNode<K, V>) myLinkedList.searchForNode(key);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    // Add key-value pair
    public void add(K key, V value) {
        MapNode<K, V> myMapNode = (MapNode<K, V>) this.myLinkedList.searchForNode(key);
        if (myMapNode == null) {
            myMapNode = new MapNode<K, V>(key, value);
            myLinkedList.appendNode(myMapNode);
        } else {
            myMapNode.setValue(value);
        }
    }
}
