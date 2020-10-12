package com.bridgelabz.datastructuresusinggenerics;

public class MapNode<K, V> implements INode<K> {
    private K key;
    private V value;
    MapNode<K, V> next;

    public MapNode(K key, V value) {
        super();
        this.key = key;
        this.value = value;
        next = null;
    }

    @Override
    public K getKey() {
        // TODO Auto-generated method stub
        return key;
    }

    @Override
    public void setKey(K key) {
        // TODO Auto-generated method stub
        this.key = key;
    }

    @Override
    public INode<K> getNext() {
        // TODO Auto-generated method stub
        return this.next;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void setNext(INode<K> next) {
        // TODO Auto-generated method stub
        this.next = (MapNode<K, V>) next;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
