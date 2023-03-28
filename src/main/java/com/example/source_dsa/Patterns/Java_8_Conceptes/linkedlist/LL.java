package com.example.source_dsa.Patterns.Java_8_Conceptes.linkedlist;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertNodeAtFirst(int val) {
        //creating a new node with value
        Node node = new Node(val);
        //assigning values to them
        //head and next is NODE whole next object
        node.next = head;
        //reassigning 1st head value to 1st
        //head node is always first node
        //abhi wale node ko head bnana pdega na
        head = node;
        if (tail == null) {
            tail = head;
        }
        //increasing size of list;
        size += 1;
    }

    public void insertLast(int val){
        if (tail==null){
        insertNodeAtFirst(val);
        return;
        }
        //add node at last
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        //increase size
        size++;
    }


    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.print("END");
    }

    public void insertAtMid(int val, int index){
        if (index==0){
            insertNodeAtFirst(val);
        }
        if (index == size){
            insertLast(val);
        }

        Node temp = head;
        //head se position reaching
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        //temp.next will create a node actually
        //yha temp ki value reassigned ho gui for next node
        temp.next= new Node(val, temp.next);

    }

    public void deleteAtFirst(int index){

        if (index == 0){
            Node n= head.next;
            head = n;
            size--;
        }
    }

    public void deleteAtMid(int ind){

        Node temp = getNodeAtAnyIndex(ind-2);
        System.out.println("Value at particular Index = "+temp.value);

        temp.next = temp.next.next;
        size--;
        System.out.println("Size = "+size);

    }

    public void deleteLast(int ind){
        tail = getNodeAtAnyIndex(ind);
        tail.next = null;
        size--;
    }

    public Node getNodeAtAnyIndex(int index){
        Node temp = head;

        for (int i = 1; i <= index; i++) {
             temp = temp.next;
            System.out.println("Insde loop ="+temp.value);
        }
        return temp;
    }


    public class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


}
