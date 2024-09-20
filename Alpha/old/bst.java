import java.util.ArrayList;

public class bst{
    static class Node{
        int data;
        Node right;
        Node left ;

        Node(int data){
            this.data =data;
        }
    }
    public static Node insert(Node root,int val){

    if(root == null){
    root = new Node(val);
    return root;
}
     if(root.data > val){
        root.left =insert(root.left,val);
       
     }else{
        root.right = insert(root.right,val);    
     }
     return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);

    }
    public static boolean search(Node root,int key){
        if(root == null){
            return false;
        }
        if (root.data == key){
            return true;
        }
        if(root.data>key){
            return search(root.left , key);
        }
        else{
            return search(root.right ,key);
        }
        
    }
    public static Node delete(Node root, int val){
    if(root.data < val){
        root.right = delete(root.right, val);
    }
    else if(root.data > val){
        root.left = delete(root.left , val);
    }
     else {
        if(root.left == null && root.right == null){
            return null;
        }
        if(root.left == null){
            return root.right;
        }
        if(root.right == null){
            return root.left;
        }
        Node Is = intheorder(root.right);
        root.data= Is.data;
        root.right = delete(root.right,val);

     }
     return root;
    }
    public static Node intheorder(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void printinrange(Node root , int k1 , int k2 ){
        if (root ==  null){
            return ;
        }
     if(root.data>= k1 && root.data <= k2) {
        printinrange(root.left , k1 , k2);
        System.out.print(root.data + " ");
        printinrange(root.right , k1 , k2);
         
    }  
    else if ( root.data <  k1){
        printinrange(root.left, k1 , k2 );
    }else {
        printinrange(root.right , k1 , k2);

    }

    }
    public static void printpath(ArrayList<Integer> path){
        for(int i = 0 ; i< path.size(); i++){
            System.out.print(path.get(i) + "->");

        }
        System.out.println("Null");
     }
     public static void roottoleaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        
        path.add(root.data);
        if(root.left == null && root.right == null){
            printpath(path);
          }
        roottoleaf(root.left , path);
        roottoleaf(root.right, path);
        path.remove(path.size()-1);
     }
     public static boolean isvalid(Node root , Node min , Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if (max != null && root.data >= max.data ){
            return false ;
        }
        return isvalid(root.left, min, root) && isvalid(root.right, root, max);
     }


    public static void main (String args[]){
    int values[] = {8,5,3,1,4,6,10,11,14};
    
    Node root =null;
    for(int i=0;i<values.length;i++){
        root = insert(root ,values[i]); 

    }
    inorder(root);
    System.out.println();
    if(isvalid(root, null, null)){
        System.out.print("valid");
    }else {
        System.out.print("invalid");
    }


    }
}