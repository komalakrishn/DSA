import java.util.*;
public class twentysix {
    public static int fibbo(int n ){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        int fibn1 = fibbo(n-1);
        int fibn2 = fibbo(n-2);
        int fn = fibn1 + fibn2;
        return fn;
    }
    public static void main (String args[]){
        int n = 25;
        System.out.print(fibbo(n));
    }
}