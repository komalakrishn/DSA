import java.util.*;
public class BubbleSort {
    public static void bubblesort(int numbers[] ){
        for (int i=0; i<numbers.length-1; i++){
            for (int j=0 ; j<numbers.length-1-i;j++ ){
             if (numbers[j]> numbers[j+1]){
                int temp = numbers[j+1];
                numbers[j+1] = numbers[j];
                numbers[j] = temp;
             }
           
            }
           
            }
        }
        public static void print(int numbers[]){
            for(int i=0 ; i<numbers.length;i++){
                System.out.print(numbers[i]+" ");
            }
            System.out.println();
         }
    
    public static void main(String args[]){
        int numbers[]= {1,4,3,6,7,2,10};
        bubblesort(numbers);
        print(numbers);
    }
}