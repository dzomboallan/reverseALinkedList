/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RecursiveMethod;

/**
 *
 * @author hunnytaggy
 */

//Recursive Java program to reverse a linked list
public class Recursion {
    static Node head; // head of list
    
    static class Node{
        int data;
        Node next;
        Node (int d){
            data = d;
            next = null;
        }
    }
    
    static Node reverse(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        
        /*reverse the rest list and put the first element at the end*/
        Node rest = reverse(head.next);
        head.next.next = head;
        
        head.next = null;
        
        /*fix the head pointer*/
        return rest;
    }
    
    /* Function to print linkedlist*/
    static void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+"");
            temp = temp.next;
        }
        System.out.println();
    }
    
    static void push(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    
    /* Driver program to test above function*/
    public static void main(String[] args) {
        /*Start with empty list*/
        push(20);
        push(4);
        push(15);
        push(85);
        
        System.out.println("Given LinkedList");
        print();
        
        head = reverse(head);
        System.out.println("Reversed LinkedList");
        print();
    }
}
