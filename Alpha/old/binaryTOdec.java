import java.util.*;
public class binaryTOdec{
    public static void  bintodec(int n ){
        int p = 0;
        int dec = 0;
        int num = n;
        while (n>0){
      int ld = n%10;
      dec = dec + (ld*(int) Math.pow(2,p));
       p ++;
       n=n/10;
        --
        }
        System.out.print("deciaml no of "+ num +"= "+ dec);

    }
    public static void main (String args []){
        bintodec(101);
    }
}