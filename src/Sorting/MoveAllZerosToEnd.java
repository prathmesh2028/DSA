package Sorting;

import java.util.ArrayList;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int[] arr = {13,4,5,6,98,6,52,0,6,2,0,21,0,7,0,1,0,8,0};
        int n = arr.length;

//        for(int i = 0 ; i < n - 1 ; i++){
//            for(int j = 0 ; j < n - 1 - i ; j++){
//                if(arr[j] == 0){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }

        int j = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] != 0){
                if(i != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for(int i : arr) System.out.print(i + " ");
   }
}
