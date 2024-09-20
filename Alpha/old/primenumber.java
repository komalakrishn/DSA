public class primenumber{
    public static void primenumber( int end ){
       int st = 0 ;
       int i ;
       int prime ;
       int m = end ;
       for(int n = st ; n < end ; n ++){
       if(n == 0|| n == 1){
        System.out.print(n + " ");
       }
       for( i = 2 ; i < n ; i++ ){
        if( n%i == 0){
            break ;
        }
               
        }
        if( n ==i ){
            System.out.print(i + " ");
        }
      }
    }
    
    
    public static void main(String args[]){
        
        int ending = 10 ;
        primenumber( ending);
    }
}