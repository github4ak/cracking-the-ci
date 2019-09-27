package chapter_2;

import java.util.HashSet;
import java.util.Set;

class Node{
    Node next = null;
    int data;
    
    Node(int d){
        data = d;
    }
}

public class ctci_2_1{
    
    static void traverseList(Node myNode){
        while(myNode !=null){
            System.out.print(myNode.data+"->");
            myNode = myNode.next;
        }
    }
    
    static void removeDuplicate(Node myNode){
        
        Set<Integer> nodeData = new HashSet<>();
        
        Node head = myNode;
        
        nodeData.add(myNode.data);
        
        while(myNode.next != null){
            if(nodeData.contains(myNode.next.data)){
                System.out.println("\nDuplicate found : "+myNode.next.data);
                Node temp = myNode.next;
                myNode.next = temp.next;
                temp = null;
            }else{
            nodeData.add(myNode.next.data);
            }
            myNode = myNode.next;
        }
        
        //Last element check
        if(nodeData.contains(myNode.data)){
            System.out.println("Current element is "+myNode.data);
            myNode = null;
        }
        
        System.out.println("Traversing the list");
        traverseList(head);
        
    }
    
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(1);
        
        System.out.println("Traversing the list");
        traverseList(head);
        removeDuplicate(head);
    }
}
