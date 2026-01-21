package Sorting;

public class  BubbleSort {
    public static void main(String[] args) {

        // OPTIMIZED BUBBLE SORT

        int[] arr = {8,7,1,2,4,99,1,3,60};
//        for(int i = 0 ; i < arr.length - 1 ; i++){
//            boolean isSorted = true;
//            for(int j = 0 ; j < arr.length -1 ; j++){
//                if(arr[j] > arr[j+1]){
//                    isSorted = false;
//                    break;
//                }
//            }
//
//
//            if(isSorted) break;
//
//
//            for(int k = 0 ; k < arr.length - 1 - i ; k++){
//                if(arr[k] > arr[k+1]){
//                    int temp = arr[k];
//                    arr[k] = arr[k+1];
//                    arr[k+1] = temp;
//                }
//            }
//        }
        for(int i = 0 ; i < arr.length ; i++) System.out.print(arr[i] + " ");

        System.out.println();





        // ANOTHER ONE APPROACH
        for(int i = 0 ; i < arr.length - 1 ; i++){
            int swaps = 0;
            for(int j = 0 ; j < arr.length - 1 ;  j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0) break;
        }
        for(int i = 0 ; i < arr.length ; i++) System.out.print(arr[i] + " ");
    }
}
