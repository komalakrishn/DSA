import java.util.*;
public class LinkedList{
    public void print(){
        if(head == null){
            System.out.print("ll is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
            
        }
        System.out.println("NULL");
    }

    
    public static class Node {
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;

        }
    } 
    public static Node head;
    public static Node tail;
    public static int size ; 
    

    public void addlast(int data ){
        Node newNode = new Node(data);
        if (head == null){
             head = tail = null ;
             return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void addfirst(int data){
         Node newNode  = new Node(data);
        if (head == null){
           head = tail = newNode;
           return;
        }
       
        newNode.next = head ;
        head = newNode;
    }
    
    public int removefirst(){
        int val = head.data;
        head = head.next;
        return val;

    }
    public int removelast(){
        if(size==0){
            System.out.print("ll is empty");
            return Integer.MIN_VALUE;
        }else if (size==1){
            int val = head.data;
            head=tail=null;
            size =0;
            return val;
        }
        Node prev = head;
        for (int i = 0 ; i < size-2;i++){
             prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrsearch(int key){
        
        Node temp = head ;
        int i=0;
        while (temp!=null){
            if(temp.data == key){
                return i ;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head , int key ){
        if (head == null){
            return -1;
        }
        if (head.data == key){
            return 0;
        }
        int idx = helper(head.next , key);
            if (idx == -1){
                return -1 ;
            }
           return idx+1;
    }
    public int recsearch(int key ){
        return helper(head.next , key );
    } 
    public void deletenth(int n){
        int sz = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            sz++;
        }
        if (n == sz){
            head = head.next;
            return;
        }
        int i = 1;
        int tofind = sz-n;
        Node prev = head ;
        while (i< tofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    //slow-fast
    public  Node  middle(Node head ){
        Node slow = head ;
        Node fast = head ;
        while ( fast != null && fast.next !=null){
               slow = slow.next;
               fast = fast.next.next;

        }
        return slow; 
    }
    public boolean palindrome(){
        if (head == null || head.next == null){
            return true;
        }
        Node midNode = middle(head);
        Node prev = null;
        Node curr = midNode;
        Node next ;
        while ( curr!= null ){
            next = curr.next;
            curr.next= prev ;
            prev = curr;
            curr = next ;
        }
        Node right = prev ;
        Node left = head ;
        while ( right != null){
            if ( left.data != right.data){
                return false ;
            }else {
                left = left.next;
                right = right.next;
                
            }
        }
        return true;

    }
    public static boolean cycle(){
        Node slow = head ;
        Node fast = head ;
        while(fast !=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast){
                return true ;

            }
        }
        return false;
    }
    public static void removecycle(){
          Node slow = head ;
          Node fast = head ;
          boolean cycle = false ;
          while(fast!= null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break ;
            }
          }
            if (cycle == false  ){
                  return ;
            }
            slow = head ;
            Node prev = null;
            while(slow!=fast){
                prev = fast ;
                slow = slow.next;
                fast = fast.next;

            }
            prev.next = null;
          
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addlast(2);
        ll.print();
         ll.head = ll.mergesort(ll.head);
         ll.print();
    }
    private Node merge(Node head1 , Node head2){
        Node mergedll = new Node(-1);
        Node temp = mergedll ; 
        while (head1 != null && head2 != null){
            if (head1.data<= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else {
                if ( head2.data< head1.data){
                    temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
                }
            }
        }
            while ( head1!= null ){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while ( head2!= null){
                temp.next = head2;
                head2= head2.next;
                temp = temp.next;

            }
         return mergedll.next;
    }
    private Node getmid(Node head ){
        Node slow=head;
        Node fast = head.next ;
        while(fast!= null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
    public Node mergesort(Node head ){
        if ( head == null || head.next == null){
            return head;
        }
        Node  mid = getmid(head);
        Node righthead = mid.next;
        mid.next = null;
        Node newleft = mergesort(head);
        Node newright = mergesort(righthead);
         return merge(newleft,newright);
    }

}