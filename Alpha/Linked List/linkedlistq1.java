import java.util.*;
class linkedlistq1 {
    static class Node {
        int data ;
        Node next ; 
        
        Node(int d){
            data = d ;
            next = null;
        }
    }
    public  Node intersectionPoint(Node head1, Node head2){
        while(head2 != null){
            Node temp = head1;
            
            while( temp != null){
                if(temp == head2){
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }
    public static void main(String args[]){
        linkedlistq1 list = new linkedlistq1();
        Node head1;
        Node head2;
        head1 = new Node(1);
        head2 = new Node(4);

         Node newNode = new Node(5);
         head2.next = newNode ;
         newNode  = new Node(2);
         head1.next = newNode ;
         head1.next.next = new Node(3);
         newNode = new Node(6);
         head1.next.next.next = newNode ;
         head2.next.next = newNode ;
         newNode = new Node(7);
         head1.next.next.next.next = newNode;
         head2.next.next.next = newNode;
         head1.next.next.next.next.next = null ;
         Node intersectionpoint = list.intersectionPoint(head1 , head2);
        if(intersectionpoint == null){
            System.out.println(" no intersection ");
        }else{
            System.out.print("intersection point is "+ intersectionpoint.data);
        }
        
       
        
    }
}