package Sample_practise;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {


        // code for the bubble sort

        int[] arr = {5,2,8,-2,0,1,3,6,5,7};
        int n = arr.length;
        for(int i = 0 ; i < n-2 ; i++){
            for(int j = 0 ; j < n - 1 - i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i : arr) System.out.print(i + "  ");


    }
}
