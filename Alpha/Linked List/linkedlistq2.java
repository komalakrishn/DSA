import java.util.*;
public class linkedlistq2 {
     static class Node{
        int data;
        Node next ;

        Node(int d){
            this.data = d ;
            this.next = null;
        }
     }
     static void printll(Node head ){
     Node temp = head ;
     while(temp != null){
        System.out.print(temp.data);
        temp = temp.next;
     }
     System.out.println();
    }
     static Node pushdata(Node head , int data){
        Node newNode = new Node(data);
        newNode.data = data;
        newNode.next = head ;
        head = newNode ;
        return head ;
     }
     static void keepmdeleten(Node head , int m , int n){
        Node temp = head, t ;
        int num ;
        while(temp != null){
            for(num = 1  ; num< m && temp != null ;num++){
                temp = temp.next;
                if(temp == null){
                    return ;
               }
               }
               t = temp.next;
               for( num = 1; num< n && t != null ; num++){
                   Node temp1 = t;
                   t = t.next ;
               }
               temp.next = t;
               temp = t;
        }
     }
     public static void main(String args []){
        Node head = null ;
        int m = 2 ;
        int n = 3;
        head = pushdata(head , 10);
        head = pushdata(head , 9);
        head = pushdata(head , 8);
        head = pushdata(head , 7);
        head = pushdata(head , 6);
        head = pushdata(head , 5);
        head = pushdata(head , 4);
        head = pushdata(head , 3);
        head = pushdata(head , 2);
        head = pushdata(head , 1);
        System.out.print("m = " + m + "& n = " + n);
        System.out.println(" linked list we have is : ");
        printll(head);
        keepmdeleten(head , m , n);
        System.out.print("linked list after deletion :");
        printll(head);
       }
}