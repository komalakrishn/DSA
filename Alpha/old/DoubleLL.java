public class DoubleLL{
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size ;
    public void addfirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public  void print(){
        Node temp = head ;
        while(temp!=null){
            System.out.print(temp.data+"<-->");
              temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        DoubleLL dll  = new DoubleLL();
        dll.addfirst(1);
        dll.addfirst(2);
        dll.addfirst(3);
        dll.print();
        System.out.println(dll.size);
        dll.removefirst();
        dll.print();
        System.out.println("size of array is" +" " +dll.size);
        dll.reverse() ;  
        dll.print();
    }
    public int removefirst(){
         if (head == null){
            System.out.print("no data");
             return Integer.MIN_VALUE;
         }
         if (size == 1){
         int val = head.data;
         head = tail = null;
         size--;
         return val ;
         }
         int val = head.data;
         head = head.next;
         head.prev = null;
         size--;
         return val;
    }
    public void reverse(){
        Node curr = head ;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}