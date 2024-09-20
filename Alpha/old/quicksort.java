import java.util.*;
public class quicksort{

public static void quicksort(int arr[],int si , int ei ){
    if (si>=ei){
        return;
    }
    int p = partition(arr,si,ei);
    quicksort(arr,si,p-1);
    quicksort(arr,p+1,ei);

}
public static int partition(int arr[],int si , int ei){
    int p = arr[ei];
    int i = si-1;
    for(int j =si; j<ei; j++){
        if (arr[j] <= p){
            i++;
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        
    }
    i++;
        int temp = p ;
            arr[ei] = arr[i];
            arr[i] = temp ;
            return i ;
}


public static void printarr(int arr[]){
        for(int i =0 ; i < arr.length ;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }


public static void main (String args []){
        int arr[] = {2,5,4,6,7,10};
        quicksort(arr,0,arr.length-1);
        printarr(arr);
    }
}