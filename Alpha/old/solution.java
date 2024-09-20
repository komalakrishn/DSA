import java.util.Scanner;
class solution{
    public static void main (String args[] ){
       int [][] A = new int  [3][3];
       Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i< 3 ; i++){
            for(int j =0 ; j < 3 ; j++){
                 A[i][j] = sc.nextInt();
            }
        }
        transpose(A);
    }
    public static void transpose(int [][] A){
        int [][] B = new int  [3][3];
        for(int i = 0 ; i< 3 ; i++){
            for(int j =0 ; j < 3 ; j++){
                 B[i][j] = A[j][i];
            }
        }
         print(B);
    
    }
    public static void print(int[][]A){
        for(int i = 0 ; i< 3 ; i++){
            for(int j =0 ; j < 3 ; j++){
                 System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}