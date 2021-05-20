package com.sen2212.fooddeliveryapp.datastructures;

public class BasketList {
    public static int unseenNotifications = 0;

    //Represent the head and tail of the singly linked list
    public static LinkedListNode<FoodInfo> head = null;
    public static LinkedListNode<FoodInfo> tail = null;

    //addNode() will add a new node to the list
    public static void addNode(FoodInfo info) {
        //Create a new node

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = LinkedListNode.CreateList(info);
            tail = head;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            LinkedListNode<FoodInfo> newTail = tail.addNextNode(info);
            //newNode will become new tail of the list
            tail = newTail;
        }
    }
    public static void removeNode(LinkedListNode<FoodInfo> node){
        if (head == null)
            return;
        if (node == null)
            return;

        if (node == head)
        {
            if(head.getNext()!=null)
                head = head.getNext();   // Change head
            else
                head = null;
            return;
        }
        if(node==tail){
            tail = node.getParent();
            tail.removeNext();
            return;
        }
        node.getNext().setParent(node.getParent());
        node.getParent().setNext(node.getNext());
    }
}
