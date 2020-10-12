package com.bridgelabz.datastructuresusinggenerics;

import java.util.ArrayList;

public class LinkedListForHashOperation<K, V> {
    private final int totalIndexSize;
    ArrayList<LinkedList<K>> indexArray;

    // Constructor
    public LinkedListForHashOperation() {
        totalIndexSize = 15;
        indexArray = new ArrayList<>(totalIndexSize);
        for (int i = 0; i < totalIndexSize; i++)
            this.indexArray.add(null);
    }

    // Get bucket index for given key
    private int getIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        int index = hashCode % totalIndexSize;
        return index;
    }

    // Get value given Key
    public V get(K key) {
        int index = this.getIndex(key);
        LinkedList<K> linkedList = indexArray.get(index);
        if (linkedList == null)
            return null;
        MapNode<K, V> myMapNode = (MapNode<K, V>) linkedList.searchForNode(key);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    // Add to linked hash map
    public void add(K key, V value) {
        int index = getIndex(key);
        LinkedList<K> linkedList = indexArray.get(index);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            indexArray.set(index, linkedList);
        }
        MapNode<K, V> myMapNode = (MapNode<K, V>) linkedList.searchForNode(key);
        if (myMapNode == null) {
            myMapNode = new MapNode<K, V>(key, value);
            linkedList.appendNode(myMapNode);
        } else {
            myMapNode.setValue(value);
        }
    }
}
