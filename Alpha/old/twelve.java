import java.util.*;
public class twelve {
    public static int linearsearch(int numbers[] , int key ){
        for (int i=0; i<numbers.length;i++){
            if (numbers[i] == key){
                return i+1 ;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]= {2,3,4,5,6,7,8,9};
        int key = 4;
        int index = linearsearch(numbers,key);
        if (index == -1){
            System.out.print("not found");
        }
        else {
        System.out.println( " key is at =" + index);
        }
    }
}