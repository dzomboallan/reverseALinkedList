/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversealinkedlist;

/**
 *
 * @author hunnytaggy
 */
// Iterative method

public class ReverseALinkedList {

    static Node head;
    
    static class Node{
        int data;
        Node next;
        
        Node (int d){
            data = d;
            next = null;
        }
    }
    
    /* Function to reverse the linked list*/
     Node reverse(Node node){
         Node prev = null;
         Node current = node;
         Node next = null;
         
         while(current != null){
             next = current.next;
             current.next = prev;
             prev = current;
             current = next;
         }
         node = prev;
         return node;
     }
     
     // print content of double linked list,
     void printList(Node node){
         while(node != null){
             System.out.println(node.data + "");
             node = node.next;
         }
     }
     
     // Driver class
    public static void main(String[] args) {
        ReverseALinkedList list = new ReverseALinkedList();
        list.head = new Node(85);
        list.head.next =new Node(15);
        list.head.next.next =new Node(4);
        list.head.next.next.next =new Node(20);
        
        System.out.println("Given LinkedList");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed LinkedList");
        list.printList(head);
    }
    
}
