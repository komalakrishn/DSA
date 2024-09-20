import java.util.Arrays ;
import java.util.*;
public class seventeen{
    public static void main (String args[]){
        int arr[] = { 5,4,1,3,2};
        Arrays.sort(arr,0,5);
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}