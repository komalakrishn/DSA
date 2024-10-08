public class StackwithArray{
    int stack[];
     int top ;
    int maxsize ;

    public StackwithArray(int size){
        stack= new int[size];
        top = -1;
        maxsize = size;
    }
    public boolean isfull(){
        return top == maxsize-1;
    }
    
    public boolean isempty(){
        return top == -1;
    }
    
    public void push(int value){
        if(isfull()){
            System.out.print("Stack is full");
        }else{
            top++;
            stack[top] = value;
            System.out.println( value + "  value pushed into stack");
        }
    }

    public int pop(){
        if ( isempty()){
        System.out.print("Stack is empty");
        return -1;
        }else{
         int temp = top ;
         top -- ;
         return stack[temp];
        }
    }
    public int peek(){
        if(isempty()){
            System.out.print("Stack is empty");
            return -1;
        }else{
            return stack[top];
        }
    }
    
    public  void display(){
       if(isempty()){
        System.out.print("stack is empty");
       }else{
        System.out.println("Stack elements:");
        for(int i = 0; i <= top; i++){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
       }
       
    }

    public static void main(String args[]){
        StackwithArray stack = new StackwithArray(6);

        stack.push(1);
        stack.push(2);
        stack.push(15);
        stack.push(18);

        stack.display();
        
    }
}