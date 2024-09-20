public class armstrong{
    public static boolean armstrong(int n){
        int sum = 0;
        int number = n;
        int m ;
        while(n!=0){
            m = n%10 ;
            m = m*m*m;
            sum = sum + m ;
            n  = n/10;
        }
        if( number == sum){
            return true;
        }else{
            return false ;
        }
    }
    public static void main(String args[]){
        int n = 153 ;
        System.out.print(armstrong(n));
    }
}