/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HeadRecursive;

import java.util.Stack;

/**
 *
 * @author hunnytaggy
 */
public class LinkedList {
    // Create a class node to enter values and address in the list
    static class Node{
        int data;
        Node next;
    };
    
    static Node head = null;
    
    // Function to reverse the linked list
    static void reverseLL(){
        // Create a stack "s" of Node type
        Stack<Node> s = new Stack<>();
        Node temp = head;
        while(temp.next != null){
            // Push all the nodes into stack
            s.add(temp);
            temp = temp.next;
        }
        head = temp;
        while(!s.isEmpty()){
            // Store the top values of stack in list
            temp.next = s.peek();
            
            // pop the value from stack
            s.pop();
            
            // update the next pointer in the list
            temp = temp.next;
        }
       temp.next = null;
    }
    
    // Function to Display the elements in List
    static void printList(Node temp){
        while(temp != null){
            System.out.println(temp.data +"");
            temp = temp.next;
        }
    }
    
    // Program to insert back of the linkedlist
    static void insert_back(int values){
        // we have used insertion at back method to enter values in the list (e.g. 1,2,3,4,null)
        Node temp = new Node();
        temp.data = values;
        temp.next = null;
        
        if (head == null) {
            head = temp;
            return;
        }else{
            Node last_node = head;
            while(last_node.next != null){
                last_node = last_node.next;
            }
            last_node.next = temp;
            return;
        }
    }
    
    //Driver code
    public static void main(String[] args) {
        insert_back(1);
        insert_back(2);
        insert_back(3);
        insert_back(4);
        
        System.out.println("Given Linked List");
        printList(head);
        reverseLL();
        System.out.println("\nReversed LinkedList\n");
        printList(head);
        
    }
    
}
