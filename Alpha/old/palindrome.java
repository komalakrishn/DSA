// import java.util.*;
public class palindrome{
    public static boolean ispalindrome(int input){
       int temp = input;
       int sum = 0 ;
       int a;
       while(temp > 0){
         a = temp %10;
         sum = (sum*10)+a;
         temp = temp/10;
       }
       if(sum == input){
        return true;
       }else{
        return false ;
       }
    }
    public static void main(String args[]){
        int palindrome = 123421;
        
        if(ispalindrome(palindrome)){
            System.out.print("is palindrome");
        }else{
            System.out.print("not palindrome");
        }
    }
}