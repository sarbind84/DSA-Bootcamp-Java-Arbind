package com.example.source_dsa.Patterns.interview_codedecode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author : ArbindSharma
 * @Date : 13-04-2023
 **/
class LinkedListMergeNode {
    int val;
    LinkedListMergeNode next;

    public LinkedListMergeNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class main1{

    public static void main(String[] args) {
        LinkedListMergeNode nodeA = new LinkedListMergeNode(5);
        nodeA.next = new LinkedListMergeNode(10);
        nodeA.next.next = new LinkedListMergeNode(15);
        nodeA.next.next.next = new LinkedListMergeNode(40);

        LinkedListMergeNode nodeB = new LinkedListMergeNode(2);
        nodeB.next = new LinkedListMergeNode(3);
        nodeB.next.next = new LinkedListMergeNode(20);

        List<Integer> k1 = new ArrayList<>();

        while (nodeA != null){
            k1.add(nodeA.val);
            nodeA = nodeA.next;
        }

        while (nodeB != null){
            k1.add(nodeB.val);
            nodeB = nodeB.next;
        }

        Collections.sort(k1);

        //always I have to return a head right
        //creating new node as to add new sorted list
        LinkedListMergeNode result = new LinkedListMergeNode(-1);
        LinkedListMergeNode temp = result;

        for (Integer l: k1) {
            //result ke next me dalna h
            // as it start from head
            result.next = new LinkedListMergeNode(l);

            result = result.next;


            }

        //moving forward to return head
        temp = temp.next;
        LinkedListMergeNode toPrint = temp;

        while (toPrint!=null){
            System.out.println(toPrint.val);
            toPrint = toPrint.next;
        }


    }

}