import java.util.*;
public class topview{
    static class Node{
        int data;
        Node left ,right;

        public Node(int data){
            this.data = data;
            this.left =null;
            this.right = null;
        }
    }
    static class info{
        Node node ; 
        int hd;
        public info(Node node ,int hd){
            this.node= node;
            this.hd = hd;
        }
    }
    public static void topview(Node root){
          Queue<info> q = new LinkedList<>();
          HashMap<Integer , Node> map = new HashMap<>();
          int min =0;int max = 0;
          q.add(new info(root,0));
          q.add(null);
          while(!q.isEmpty()){
                info curr = q.remove();
                if(curr == null){
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                if(!map.containsKey(curr.hd)){
                     map.put(curr.hd,curr.node);
                    
             }
                if(curr.node.left!=null){
                    q.add(new info(curr.node.left,curr.hd-1));
                    min = Math.min(min,curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new info(curr.node.right,curr.hd+1));
                    max = Math.max(min,curr.hd+1);
                }
                }
               

          }
          for(int i= min ; i <= max ; i++){
            System.out.print(map.get(i).data); 
          }
    }
    
   
    public static void klevel(Node root, int level , int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data+" ");
            return;
        }
        klevel(root.left , level+1 ,k);
        klevel(root.right , level+1 ,k);
    }
    public static Node lca(Node root , int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
         ArrayList<Node> path2 = new ArrayList<>();
        path(root , n1 ,path1);
        path(root , n2 ,path2);
        //lca;
        int i=0;
        for(; i<path1.size() && i< path2.size(); i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        Node lca = path1.get(i-1) ;
        return lca;

    }
   public static boolean  path(Node root , int n ,ArrayList<Node> path ){
    if ( root == null){
        return false ;
    }
    path.add(root);
    if(root.data == n){
        return true;
    }
    boolean left = path(root.left,n,path);
    boolean right = path(root.right, n ,path);
    if(left || right ){
        return true;

    }
    path.remove(path.size()-1);
    return false;
   }
   public static Node lca2(int n1 , int n2, Node root){
    if(root==null|| root.data==n1||root.data == n2){
        return root;
    }
    Node leftlca = lca2(n1,n2,root.left);
    Node rightlca = lca2(n1,n2,root.right);
    if(leftlca==null){
        return rightlca;
    }
    if(rightlca==null){
        return leftlca;
    }
    return root;
   }
   public static int lcadst(Node root,int n){
    if(root==null){
        return -1;
    }
    if(root.data==n){
        return 0;
    }
    int leftdist = lcadst(root.left,n);
    int rightdist = lcadst(root.right,n);

     if(leftdist == -1 && rightdist == -1){
        return -1;
     }else if( leftdist ==-1){
        return rightdist+1;
     }else {
        return leftdist+1;
     }
   }
   public static int mindist( int n1, int n2,Node root){
    @SuppressWarnings("unused")
    Node lca = lca2(n1,n2,root);
    int dst1 = lcadst(root,n1);
    int dst2 = lcadst(root,n2);
      return dst1+dst2;
   } 
   public static int kancestor(Node root,int n ,int k){
            if(root == null){
                return -1;  
            }
            if(root.data==n){
                return 0;
            }
            int leftdist = kancestor(root.left ,n,k);
            int rightdist = kancestor(root.right ,n,k);

            if(leftdist == -1 && rightdist ==-1){
                return-1;
            }
            int max = Math.max(leftdist,rightdist);
            if(max+1 == k){
                System.out.println(root.data);
            }
            return max+1;
         }
         public static int transform(Node root){
            if(root==null){
                return 0;
            }
            int leftchild = transform(root.left);
            int rightchild = transform(root.right);

            int data = root.data;
            int newleft = root.left == null ? 0 : root.left.data;
            int newright = root.right == null ? 0 : root.right.data;

            root.data = newleft+ leftchild + newright + rightchild; 
            return data;
         }
         public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data +"  ");
            preorder(root.left);
            preorder(root.right);

         }
         public static Node createmirror(Node root){
            if(root ==  null){
                return null;
            }
            Node leftmirror = createmirror(root.left);
            Node rightmirror = createmirror(root.right);
            root.left = rightmirror;
            root.right = leftmirror;
            return root;
         }


    public static void main(String args[]){
          Node root = new Node(8);
          root.left= new Node(5);
          root.right= new Node(10);
          root.left.left= new Node(3);
          root.left.right= new Node(6);
         
          root.right.right= new Node(11);
          createmirror(root);
          preorder(root);
    }
}