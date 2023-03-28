package com.example.source_dsa.Patterns.Java_8_Conceptes.linkedlist;

public class MainMethodForLinkedList {

    public static void main(String[] args) {
        LL list = new LL();
        list.insertNodeAtFirst(3);
        list.insertNodeAtFirst(4);
        list.insertNodeAtFirst(5);

        list.insertLast(9);
       // list.insertAtMid(28, 2);

//deletion operation
//        list.delete(0);
        list.display();
        System.out.println();
       // list.deleteLast(4);
        list.deleteAtMid(3);
        list.display();

    }
}
