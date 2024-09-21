import java.util.*;
public class linkedlistq4{
    class Node {
     int data ;
     Node next;
     Node(int d){
        this.data = d;
        this.next = null;
     }
    }
    Node head ;
    public  void evenoddorder(){
        Node end = head ;
        Node prev =null;
        Node curr = head ;
        while(end.next != null){
           end = end.next;
        }
        Node newend = end;
        while(curr.data%2 != 0 && curr!= end ){
            newend.next = curr ;
            newend = curr ; 
            prev.next = curr.next ;
            curr.next = null;
        }
        if(curr.data%2 == 0){
            head = curr;
        
        while(curr!= end){
            if(curr.data %2 == 0){
                prev = curr;
                curr = curr.next;
            }else{
                prev.next = curr.next;
                newend.next = curr;
                curr.next = null;
                newend = curr;
                curr = prev.next;
            }
        }
    }
        else {
            prev = curr;
        }
        if(newend != end && end.data %2 != 0){
            prev.next = end.next ;
            end.next = null;
            newend.next = end;
        }

    }
    public  void printList(){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data + "  ");
            temp = temp.next ;
        }
        System.out.println();
    }
    public  void push(int data){
        Node newNode = new Node(data);
        newNode.next = head ;
        head = newNode;
    }
    public static void main(String args[]){
        linkedlistq4 llist = new linkedlistq4();
        llist.push(6);
        llist.push(1);
        llist.push(4);
        llist.push(5);
        llist.push(10);
        llist.push(12);
        llist.push(8);
        System.out.print("linked list before :");
        llist.printList();
        llist.evenoddorder();
        System.out.print("after updating");
        llist.printList();

    }
}