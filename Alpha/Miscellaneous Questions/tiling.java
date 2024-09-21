import java.util.*;
public class tiling{
    public static int tiling(int n){
        if (n==1|| n ==0 ){
            return 1;
        }
        int verticaltiles = tiling(n-1);
        int horizantaltiles = tiling(n-2);

        int totalways = verticaltiles + horizantaltiles;
        return totalways;
    }
    public static void main(String args []){
        System.out.print(tiling(1000));

    }

}