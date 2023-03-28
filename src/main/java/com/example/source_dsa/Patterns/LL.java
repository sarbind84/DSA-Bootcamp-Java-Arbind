package com.example.source_dsa.Patterns;

/**
 * @Author : ArbindSharma
 * @Date : 01-03-2023
 **/
public class LL {

    Node head;
    Node tail;
    int size = 0;

    public void insertLast(int val) {
        Node newNode = new Node(val);
        newNode.next = null;
        Node last = head;



        if (head == null){
            head = newNode;
            newNode.prev = null;
            return;
        }


        //if you are inserting it for the very first time it can be null
        while (last.next != null) {
            last = last.next;
        }

        System.out.println();
        last.next = newNode;
        newNode.prev=last;


        size++;
    }


    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;

        //if you are inserting it for the very first time it can be null
        if (head != null) {
            head.prev = newNode;

        }
        head = newNode;
        size++;
    }


    public void display() {

        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.value);
            //first update the pointer of last so it stores first value
            last = temp;
            temp = temp.next;
        }
        System.out.print("    END");

        System.out.println();

        while (last != null) {
            System.out.print(last.value);
            last = last.prev;

        }
        System.out.print("     REVERSE");
    }


    public class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
