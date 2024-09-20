import java.util.*;
public  class backtracking{
    public static void subsets(String str , String ans , int i ){
      if (i== str.length()){
        System.out.println(ans);
        return;
      }
      subsets(str , ans + str.charAt(i), i+1);
      subsets(str , ans, i+1);
    }
public static void main(String args[]){
    String str = "abc";
    subsets(str,"",0);
}
}