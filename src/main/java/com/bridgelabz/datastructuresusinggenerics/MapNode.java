package com.bridgelabz.datastructuresusinggenerics;

public class MapNode<K, V> implements INode<K> {
    private K key;
    private V value;
    MapNode<K, V> next;

    public MapNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public INode<K> getNext() {
        return this.next;
    }

    @Override
    public void setNext(INode<K> next) {
        this.next = (MapNode<K, V>) next;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
