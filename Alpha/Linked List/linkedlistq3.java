public class linkedlistq3{
    static class Node{
        int data ; 
        Node next ;
        Node(int d){
            this.data = d ; 
            this.next = null;
        }
    }
    Node head ;
    public void swapnodes(int x, int y){
        if(x == y){
            return ;
        }
        Node prevx = null ; 
         Node currx = head ;
        while(currx != null && currx.data !=x){
            prevx = currx;
            currx = currx.next;
        }
        Node prevy = null ;
        Node curry = head ;
        while(curry != null && curry.data != y){
            prevy = curry;
            curry = curry.next;
        }
        if(currx == null || curry == null){
            return ;
        }
        if(prevx != null){
            prevx.next = curry;
        }
        else{
            head = curry;
        }
        if(prevy != null){
            prevy.next = currx;
        }
        else {
            head = currx;
        }
        Node temp = currx.next;
        currx.next = curry.next;
        curry.next =  temp;
    }
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head ;
        head = newNode ;
    }
    public void printlist(){
        Node tNode = head ;
        while(tNode != null){
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }
    public static void main(String args[]){
        linkedlistq3 llist = new linkedlistq3();
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
        System.out.println("linked list before :");
        llist.printlist();
        llist.swapnodes(4, 3);
        System.out.println("\nlinked list after :");
        llist.printlist();
    }
}