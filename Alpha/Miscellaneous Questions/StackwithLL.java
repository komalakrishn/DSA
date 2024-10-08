public class StackwithLL {
    public class Node{
        int data;
        Node next ;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public  Node top;
    // public StackwithLL(){
    //     top = null;
    // }
    public boolean isempty(){
         return top == null;
    }
    
    public  void push(int value){
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
            System.out.println(value +"   pushed into stack");

    }
    public int pop(){
        if(isempty()){
            System.out.println("Stack is empty ");
            return -1;
        }else{
            int data = top.data ;
            top = top.next ;
            return data;
        }
    }
    public int peek(){
        if(isempty()){
            System.out.println("Stack is empty ");
            return -1;
        }else{
            int data = top.data;
            return data;
        }
    }
    public void display(){
        if(isempty()){
            System.out.println("Stack is empty ");
            
        }else{
            Node temp = top ;
            System.out.println("stack:");
            while(temp!= null){
                System.out.print(temp.data + "  ");
                temp = temp.next;
            }
          System.out.println();
        }

    }
    public static void main(String args []){
        StackwithLL stack = new StackwithLL();
        stack.push(1);
        stack.push(2);
        stack.push(15);
        stack.push(18);
        
        stack.display();
        System.out.println("top element:-  " + stack.peek());

       
        System.out.println( stack.pop() + "   popped from stack ");

        stack.display();
    }
}
