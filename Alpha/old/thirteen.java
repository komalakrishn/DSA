import java.util.*;
    public class thirteen {
        public static int largest(int numbers[]){
            int largest = Integer.MIN_VALUE;
            for (int i =0 ; i < numbers.length;i++){
                if (largest < numbers[i]){
                    largest = numbers[i];
                }

            }
            return largest;
        }
         
         public static void main (String args []){
            int numbers[]= {26,5,4,17,22};
            System.out.print("largest value is ="  + largest(numbers));

         }
    }
