package com.sen2212.fooddeliveryapp.datastructures;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class TreeNode<Data> {
    private Data data;
    private TreeNode<Data> parent;
    private ArrayList<TreeNode<Data>> children = new ArrayList<>();

    public static <Data> TreeNode<Data> CreateTree(Data data){
        if(data == null) throw new NullPointerException("data is null!");
        TreeNode<Data> newRootNode = new TreeNode<>(data, null);
        return newRootNode;
    }

    private TreeNode(Data data, TreeNode<Data> parent){
        this.data = data;
        this.parent = parent;
    }

    public TreeNode<Data> addChildNode(Data data){
        if(data == null) throw new NullPointerException("data is null!");
        TreeNode<Data> newNode = new TreeNode<>(data, this);
        children.add(newNode);
        return newNode;
    }

    public Data getData(){
        return data;
    }

    public void removeChildNode(int index){
        children.remove(index);
    }

    public TreeNode<Data> getChildNode(int index){
        return children.get(index);
    }

    public int getChildCount(){
        return children.size();
    }

    public TreeNode<Data> getParent(){
        return parent;
    }

    public TreeNode<Data> getRoot(){
        if(isRoot()) return this;
        else return getParent().getRoot();
    }

    public boolean isLeaf(){
        return children.size() == 0;
    }

    public boolean isBranch(){
        return children.size() != 0;
    }

    public boolean isRoot(){
        return parent == null;
    }
}
