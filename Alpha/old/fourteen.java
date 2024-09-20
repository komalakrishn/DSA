import java.util.*;
public class fourteen {
    public static int binary(int numbers[], int key){
        int start =0 ; int end = numbers.length-1;
        while (start <= end){
            int mid = (start + end)/ 2;

            if (numbers[mid]== key ){
                return mid;
            }
            if (numbers [mid]<= key ){
                start = mid + 1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;
        int a = binary(numbers,key);
        if (a == -1 ){
            System.out.print("number not found / array not sorted ");

        }else{ a = a+1 ;
            System.out.print("the number is at :-" + a );
        }
        
    }

}