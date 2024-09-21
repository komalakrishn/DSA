class sorting {
    public static void insertionsort(int array[]){
        int i;
        int j;
        for(i =1;i< array.length; i++){
            j = i-1;
            int key = array[i];
            while(j> -1 && array[j]>key){
                array[j+1] = array[j];
                j -- ;
            }
            array[j+1] = key;
        }
    }
    public static void selectionsort(int array[]){
         
        
        for(int i =0; i< array.length ; i++){
            int minindex = i;
            for(int j = i ; j< array.length; j++){
                if(array[minindex] > array[j]){
                   minindex = j ;
                }
            }
            int temp  = array[minindex];
            array[minindex] = array[i];
            array[i] = temp; 
        }

    }

    public static void printarray(int array[]){
        for(int i =0; i< array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int array[] =  {1,26,4,54,5};
        System.out.println("selectionsort :");
        printarray(array);
        selectionsort(array);
        printarray(array);
        System.out.println("insertionsort :");
        int arr[] = { 1,6,3,42,34};
        printarray(arr);
        insertionsort(arr);
        printarray(arr);
    }
}