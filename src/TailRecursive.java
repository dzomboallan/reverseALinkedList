/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hunnytaggy
 */
public class TailRecursive {
    static Node head;
    
    static class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    // A simple and tail recursive function to reverse 
    // a linked list.prev is passed as NULL initially.
    
    Node reverseUtil(Node curr, Node prev){
        /* If head is initially null OR list is empty*/
        if (head == null) {
            return head;
        }
        
        /* if last node mark it head */
        if (curr.next == null) {
            head = curr;
            /* Update next to prev node*/
            curr.next = prev;
            return head;
        }
        
        /* Save curr-> next node for recursive call*/
        Node next1 = curr.next;
        /* and update next*/
        curr.next = prev;
        reverseUtil(next1, curr);
        return head;
    }
    
    // prints content of double linked list
    void printList(Node node){
        while(node != null){
            System.out.println(node.data+"");
            node = node.next;
        }
    }
    
    // Driver code
    public static void main(String[] args) {
        TailRecursive list = new TailRecursive();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);
        list.head.next.next.next.next.next.next.next = new Node(8);
        
        System.out.println("Original LinkedList");
        list.printList(head);
        Node res = list.reverseUtil(head, null);
        System.out.println("");
        System.out.println("");
        System.out.println("Reversed LinkedList");
        list.printList(res);
    }
}
