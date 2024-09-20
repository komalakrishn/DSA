import java.util.*;

public class nineteen {
    public static  String toUppercase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUppercase(str.charAt(0));
        sb.append(ch);
        for (int i = 1 ;i < str.length();i++){
             if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUppercase(str.charAt(i)));

             }else{
                sb.append(str.charAt(i));
             }
        }
        return sb.toString();
    }
    public static void main(String args []){
        String str = " hi guys i am komal ";
        System.out.print(toUppercase(str));
    }
}