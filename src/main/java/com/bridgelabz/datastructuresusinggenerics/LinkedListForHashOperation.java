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

    // Get index for given key
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
        MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.searchForNode(key);
        return (mapNode == null) ? null : mapNode.getValue();
    }

    // Add to linked hash map
    public void add(K key, V value) {
        int index = getIndex(key);
        LinkedList<K> linkedList = indexArray.get(index);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            indexArray.set(index, linkedList);
        }
        MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.searchForNode(key);
        if (mapNode == null) {
            mapNode = new MapNode<K, V>(key, value);
            linkedList.appendNode(mapNode);
        } else {
            mapNode.setValue(value);
        }
    }

    // Remove K,V for a given K
    public V remove(K key) {
        int index = getIndex(key);
        LinkedList<K> linkedList = indexArray.get(index);
        MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.searchForNode(key);
        if (mapNode != null) {
            V deletedValue = mapNode.getValue();
            linkedList.deleteNode(key);
            return deletedValue;
        } else
            return null;
    }
}
