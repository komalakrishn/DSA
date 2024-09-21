import java.util.*;
public class Factorial {
    public static int factorial(int n ){
        int f = 1;
        for (int i=1 ;i<=n; i++){
            f = f*i;
        }
        return f ;
        
    }
    public static int bincoeff(int n ,int r ){
        int a = factorial(n);
        int b = factorial(r);
        int amb = factorial(n-r);
        int bincoeff = a/(b * amb);
        return bincoeff;


    }
    public static void main (String args []){
        System.out.print(bincoeff(5,2));
    }
    }