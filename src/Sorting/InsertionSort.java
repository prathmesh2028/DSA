package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,-2,6,7,2,0,7,2};
        printarr(arr);
        int n = arr.length;
        // selection sort here
        for(int i = 0 ; i < n ; i++){
            int min = Integer.MAX_VALUE , mindex = -1;
            for(int j = i ; j < n ; j++){
                if(arr[j] < min){
                    min = arr[j];
                    mindex = j;
                }
            }
            //swapping
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }

        printarr(arr);

    }
    public static void printarr(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
