package com.sen2212.fooddeliveryapp.datastructures;

public class LinkedListNode<Data> {

    private Data data;
    private LinkedListNode<Data> parent;
    private LinkedListNode<Data> next;

    public static <Data> LinkedListNode<Data> CreateList(Data data){
        if(data == null) throw new NullPointerException("data is null!");
        LinkedListNode<Data> newRootNode = new LinkedListNode<>(data, null);
        return newRootNode;
    }

    private LinkedListNode(Data data, LinkedListNode<Data> parent){
        this.data = data;
        this.parent = parent;
    }

    public LinkedListNode<Data> addNextNode(Data data){
        if(data == null) throw new NullPointerException("data is null!");
        next = new LinkedListNode<>(data, this);
        return next;
    }

    public Data getData(){
        return data;
    }

    public LinkedListNode<Data> getNext(){
        return next;
    }

    public LinkedListNode<Data> getParent(){
        return parent;
    }

    public LinkedListNode<Data> getRoot(){
        if(isRoot()) return this;
        else return getParent().getRoot();
    }

    public boolean isTail(){
        return next == null;
    }

    public boolean isRoot(){
        return parent == null;
    }
}
