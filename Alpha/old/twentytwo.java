import java.util.*;
public class twentytwo{
    public static int expo(int n , int a ){
        int ans = 1 ;
        while (n > 0){
            if ((n& 1) != 0){
                ans = ans * a;

            }
            a = a*a;
            n = n>>1;
        }
        return ans ;
    }
    public static void main ( String args []){
        System.out.print(expo(555,333));
    }
}