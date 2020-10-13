package com.bridgelabz.datastructuresusinggenerics;

public class HashMap<K, V> {
    LinkedList<K> linkedList;

    // Constructor
    public HashMap() {
        this.linkedList = new LinkedList<>();
    }

    // Get value given Key
    public V get(K key) {
        MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.searchForNode(key);
        return (mapNode == null) ? null : mapNode.getValue();
    }

    // Add key-value pair to Node
    public void add(K key, V value) {
        MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.searchForNode(key);
        if (mapNode == null) {
            mapNode = new MapNode<K, V>(key, value);
            linkedList.appendNode(mapNode);
        } else {
            mapNode.setValue(value);
        }
    }
}
