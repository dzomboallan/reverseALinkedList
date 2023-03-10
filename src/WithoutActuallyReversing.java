/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hunnytaggy
 */
public class WithoutActuallyReversing {
    Node head; // head of list
    
    /* Linked list Node*/
    class Node{
        int data;
        Node next;
        Node(int d){data = d; next=null;}
    }
    
    /* Function to print reverse of linked list*/
    void printReverse(Node head){
        if (head == null) return;
        
        // print list of head node
        printReverse(head.next);
        
        // after everything else is printed
        System.out.println(head.data+"");
    }
    
    /* Utility function*/
    /* Insert a new Noe at front of the list.*/
    public void push(int new_data){
        /* 1&2 allocate the Node & put in the data*/
        Node new_node = new Node(new_data);
        
        /* 3.Make next of new Node as head*/
        new_node.next = head;
        
        /* 4.Move the head to point to new Node*/
        head = new_node;
    }
    
    /* Driver function to test the above methods*/
    public static void main(String[] args) {
        // Let us create a linkedList 1->2->3->4
        WithoutActuallyReversing list = new WithoutActuallyReversing();
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        list.printReverse(list.head);
    }
}
