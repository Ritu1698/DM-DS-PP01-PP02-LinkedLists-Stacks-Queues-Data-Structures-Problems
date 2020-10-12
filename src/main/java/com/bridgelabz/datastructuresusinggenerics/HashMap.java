package com.bridgelabz.datastructuresusinggenerics;

public class HashMap<K, V> {
    LinkedList<K> linkedList;

    // Constructor
    public HashMap() {
        this.linkedList = new LinkedList<>();
    }

    // Get value given Key
    public V get(K key) {
        MapNode<K, V> myMapNode = (MapNode<K, V>) linkedList.searchForNode(key);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    // Add key-value pair
    public void add(K key, V value) {
        MapNode<K, V> myMapNode = (MapNode<K, V>) linkedList.searchForNode(key);
        if (myMapNode == null) {
            myMapNode = new MapNode<K, V>(key, value);
            linkedList.appendNode(myMapNode);
        } else {
            myMapNode.setValue(value);
        }
    }
}
