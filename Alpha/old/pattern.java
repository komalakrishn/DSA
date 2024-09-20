public class pattern{
    public static void main(String args[]){
        int rows = 5;
        pyramid(rows);
    }
    public static void pyramid(int rows){
        for(int i = 0 ; i< rows ; i++){
            for ( int j = 5 ; j>i;j--){
                System.out.print(" ");
            }
            for(int x= 0 ; x <=i; x++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}