import java.util.*;
public class twentyone {
    public static void oddoreven(int n ){
        int bit = 1 ;
        int value = n & bit ;
        if (value == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        
        }
    }
    public static void main (String args []){

        oddoreven(3);
        oddoreven(4);
    }

    
}