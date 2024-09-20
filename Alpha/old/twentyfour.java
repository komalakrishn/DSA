import java.util.*;
public class twentyfour{
    public static void increasing(int n){
        if (n==1){
            System.out.print(n + " next number is ");
            return ;
        }
        increasing(n-1);
        System.out.print(n + " next number is ");
    }
    public static void main (String argd []){
        int n = 9;
        increasing(n);
    }
}